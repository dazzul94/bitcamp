package java100.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다");
        }
    }

    private ArrayList<Connection> list = new ArrayList<>();

    // 빌려주기(있으면 꺼내주고 , 없으면 만들어준다) 이 메소드는 쓰레드들이 실행할때 동시에 못접근한다
    synchronized public Connection getConnection() throws SQLException, ClassNotFoundException {

        if (list.size() > 0) {
            return list.remove(0);
        }
        Class.forName(this.driverClassName);

        return DriverManager.getConnection(this.url, this.username, this.password);

    }

    // 반납
    public void returnConnection(Connection con) {
        try {
            if (con == null)
                return;
            if (con.isClosed())
                return;

            list.add(con);
        } catch (Exception e) {
        }
    }

    synchronized public void close() {
        for (Connection con : list) {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
