package step3;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//@WebListener
public class Listner02 implements ServletRequestListener{
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Listner02.requestInitialized()");
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Listner02.requestDestroyed()");
        
    }
}
