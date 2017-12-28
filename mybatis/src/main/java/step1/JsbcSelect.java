// DBMS 서버에게 SQL문을 보내기 - select
// => 데이터 입출력 테스트를 위한 테이블 생성하라!
//    bitcamp-docs/jdbcexam.sql 을 실행하라!
// 
package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JsbcSelect {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb",
                "study", "1111");
        
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery(
            "select * from jdbc_test");
        
        while (rs.next()) {
            System.out.printf("%d, %s, %s, %s, %d\n",
                rs.getInt("no"), // 레코드에서 값을 꺼낼 때 컬럼 이름을 지정한다.
                rs.getString(2), // select할 때 지정한 컬럼 번호를 사용할 수 있다.
                rs.getString("conts"), // 그러나 가능한 컬럼명을 사용하라!
                rs.getDate("regdt")/*.toString()*/,
                rs.getInt("vwcnt")
                );
        }
        
        rs.close();
        stmt.close();
        con.close();
    }

}









