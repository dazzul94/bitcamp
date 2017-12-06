package step1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step1/Servlet01")
public class Servlet01 implements Servlet{

    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("step1.Servlet01.init()");
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("step1.Servlet01.getServletConfig()");
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("step1.Servlet01.service()");
    }

    @Override
    public String getServletInfo() {
        return  "step1.Servlet01";
    }

    @Override
    public void destroy() {
        System.out.println("step1.Servlet01.destory()");
        
    }

}
