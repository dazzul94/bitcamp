// Spring IoC(Inversion of Control) 컨테이너 - @Component에 이름 명시하기
// 
package bitcamp.java100.ch21.ex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex3/application-context1.xml");
        
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", name, appCtx.getBean(name).getClass().getName());
        }
        System.out.println("------------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test("홍길동");
        System.out.println("------------------------------------------");
        obj.test(null);
        
    }
}