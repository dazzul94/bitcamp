package bitcamp.java100.ch17.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 {
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager .getConnection(
                "jdbc:mysql://192.168.0.52:3306/studydb"
                ,"ds_hihi","1111");
        
        PreparedStatement pstmt = con.prepareStatement("insert into jdbc_test(title, conts, regdt) values(?,?,now())"); //?는 in=parameter
        pstmt.setString(1, "나는 해커다");
        pstmt.setString(2, "언니 이거 못지우지?캬캬캬캬캬");
        
        
       pstmt.executeUpdate();
       
        System.out.println("입력완료!");

        con.close();





    }
}
