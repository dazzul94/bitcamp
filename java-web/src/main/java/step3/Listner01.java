package step3;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listner01 implements javax.servlet.ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener01.contextInitialized()");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener01.contextDestroyed()");
        
    }
}
