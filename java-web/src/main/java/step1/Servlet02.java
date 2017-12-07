package step1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet({"/step1/Servlet02/*", "/servlet02","/ohora"}) //한 URL배치에 두개이상의 Sevlet이 배치되면 안된다
public class Servlet02 implements Servlet{

    ServletConfig config;
    
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("step1.Servlet02.service()");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return  "서블릿 배치 URL";
    }

    @Override
    public void destroy() {}

}
