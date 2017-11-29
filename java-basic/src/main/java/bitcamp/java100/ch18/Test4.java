package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;


public class Test4 {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Z.class;
        
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] params = method.getParameters();
            for (Parameter param : params) {
                System.out.printf("     %s:%s\n",param.getName(), param.getType().getName());
            }
            
        }
        System.out.println("-----------------------------------------------------------------------");
        
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method.getName());
            Parameter[] params = method.getParameters();
            for (Parameter param : params) {
                System.out.printf("     %s:%s\n",param.getName(), param.getType().getName());
            }
            
        }
        
    }

}
