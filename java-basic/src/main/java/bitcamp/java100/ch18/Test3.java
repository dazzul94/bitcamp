package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;


public class Test3 {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Z.class;

        // 1) 생성자 알아내기
        Constructor<?>[] constructors = clazz.getConstructors();
        
        for (Constructor<?> constructor : constructors) {
            
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            
            for (Parameter param : parameters) {
                
                System.out.printf("     %s:%s\n",param.getName(), param.getType().getName());
            }
        }
        System.out.println("-----------------------------------------------------------------------");
        Constructor<?>[] constructors2 = clazz.getDeclaredConstructors();
        
        for (Constructor<?> constructor : constructors2) {
            
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            
            for (Parameter param : parameters) {
                
                System.out.printf("     %s:%s\n",param.getName(), param.getType().getName());
            }
        }
    }

}
