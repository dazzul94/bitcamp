package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.util.DataSource;

//@WebListener
public class ContextLoaderListener implements ServletContextListener {

    public static AnnotationConfigApplicationContext iocContainer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized 실행");

        ServletContext webApplicationInfo = sce.getServletContext();
        String configClassname = webApplicationInfo.getInitParameter("contextConfigLocation");
        try {
            Class<?> configClass = Class.forName(configClassname);
            iocContainer = new AnnotationConfigApplicationContext(configClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();

    }
}