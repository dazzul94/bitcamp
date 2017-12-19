package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/Servlet03")
public class Servlet03 extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        
        //name parameter로 이름이 넘어오면 출력하고 안넘어오면 다른 페이지로 요청하라고 응답한다.
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        if (name == null) {
            out.println("<meta http-equiv='Refresh' content='3;url=ErrorServlet'>");     
        }
        
        out.println("<meta charset='UTF-8'>");
        out.println("<title>리다이렉트- redirect (다시요청)</title>");
        out.println("</head>");
        out.println("<body>");
        
        if (name == null) {
        out.println("실행오류! (3초 후에 페이지 이동)");
        } else {
            out.printf("<p>%s 님 환영합니다</p>", name);
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
