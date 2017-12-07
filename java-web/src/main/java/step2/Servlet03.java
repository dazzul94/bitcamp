package step2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step2/Servlet03")
public class Servlet03 extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.printf("클라이언트 IP: %s\n", req.getRemoteAddr());
        System.out.printf("클라이언트 Port: %d\n", req.getRemotePort());
        
        HttpServletRequest httpReq = (HttpServletRequest)req;
        
        System.out.printf("URI: %s\n",httpReq.getRequestURI());
        System.out.printf("URL: %s\n",httpReq.getRequestURL());
        System.out.printf("servlet path: %s\n",httpReq.getServletPath());
        System.out.printf("pathInfo: %s\n",httpReq.getPathInfo());
        System.out.printf("query string: %s\n",httpReq.getQueryString());
        
        HttpServletResponse httpRes = (HttpServletResponse)res;
    }
}
