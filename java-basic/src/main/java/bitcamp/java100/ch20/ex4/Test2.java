package bitcamp.java100.ch20.ex4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex4/application-context2.xml");
    }
}
