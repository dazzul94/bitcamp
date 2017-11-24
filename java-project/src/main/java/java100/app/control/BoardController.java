package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardController implements Controller {
    
    
    @Override
    public void destroy() {
    }
    
    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다");
        }
    }

    @Override
    public void execute(Request request, Response response) {

        switch (request.getMenuPath()) {
            case "/board/list": this.doList(request, response); break;
            case "/board/add": this.doAdd(request, response); break;
            case "/board/view": this.doView(request, response); break;
            case "/board/update": this.doUpdate(request, response); break;
            case "/board/delete": this.doDelete(request, response); break;
            default: 
                response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 목록]");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study","1111");
                PreparedStatement pstmt = con.prepareStatement("select no, title, regdt, vwcnt from ex_board");
                ResultSet rs = pstmt.executeQuery();
                ){
            while (rs.next()) {
            out.printf("%d, %-4s, %4s, %d\n",
                    rs.getInt("no"),
                    rs.getString("title"),
                    rs.getString("regdt"),
                    rs.getInt("vwcnt")
                    );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doAdd(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study","1111");
                PreparedStatement pstmt = con.prepareStatement("insert into ex_board(title, conts, regdt) values(?,?,?)");
                ){
            pstmt.setString(1, request.getParameter("title"));
            pstmt.setString(2, request.getParameter("conts"));
            pstmt.setString(3, new Date(System.currentTimeMillis()).toString());
            pstmt.executeUpdate();
            
            out.println("저장하였습니다");
            
        } catch (SQLException e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 
    
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 상세 정보]");
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study","1111");
                PreparedStatement pstmt = con.prepareStatement("select * from ex_board where no=?");
                ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                out.printf("번호: %d\n", rs.getInt("no"));
                out.printf("제목: %s\n", rs.getString("title"));
                out.printf("내용: %s\n", rs.getString("conts"));
                out.printf("날짜: %s\n", rs.getString("regdt"));
                out.printf("뷰카운트: %d\n", rs.getInt("vwcnt"));
            } else {
                out.printf("%s의 성적 정보가 없습니다.", request.getParameter("no"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 
    
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study","1111");
                PreparedStatement pstmt = con.prepareStatement("update ex_board set title=?, conts=?, regdt=? where no=?");
                ){
            pstmt.setString(1, request.getParameter("title"));
            pstmt.setString(2, request.getParameter("conts"));
            pstmt.setString(3, new Date(System.currentTimeMillis()).toString());
            pstmt.setInt(4, Integer.parseInt(request.getParameter("no")));
            
            if (pstmt.executeUpdate() > 0) {
                out.println("변경하였습니다");
            } else {
                out.printf("%s의 성적 정보가 없습니다.\n", request.getParameter("no"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study","1111");
                PreparedStatement pstmt = con.prepareStatement("delete from ex_board where no=?");
                ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
            
            if (pstmt.executeUpdate() > 0) {
                out.println("삭제했습니다");
            } else {
                out.printf("%s의 성적 정보가 없습니다.\n", request.getParameter("no"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
    
}








