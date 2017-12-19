package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ErrorServlet")
public class ErrorServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        //name parameter로 이름이 넘어오면 출력하고 안넘어오면 다른 페이지로 요청하라고 응답한다.
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>error</title>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<p>name 파라미터 값이 없습니다");
        
        out.println("</body>");
        out.println("</html>");
    }
}
