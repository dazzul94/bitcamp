package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet ("/step11/Servlet07") 
public class Servlet07 extends HttpServlet {
    @Override
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       
       res.addCookie(new Cookie("이름", "hong"));
       res.addCookie(new Cookie("name", "홍길동"));
       
       res.setContentType("text/plain;charset=UTF-8");
       PrintWriter out = res.getWriter();
       out.println("보미언니를 보냈음!");
       
   }
   
}