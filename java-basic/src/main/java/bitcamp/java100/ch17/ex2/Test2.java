package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager .getConnection(
                "jdbc:mysql://localhost:3306/studydb"
                ,"study","1111");
        System.out.println("연결되었습니다");
        
        Statement stmt = con.createStatement(); //빈 sql문 객체
        stmt.executeUpdate("update jdbc_test set title='xxx', conts='xxxx' where no=1");
        System.out.println("변경완료!");

        con.close();
        stmt.close();





    }
}
