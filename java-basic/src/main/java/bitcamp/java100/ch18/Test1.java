package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test1 {
    public static void main(String[] args) throws Exception {
//        case1) - 유연함
        Class<?> c1 = Class.forName("java.io.BufferedReader");
//        case2) -하드코딩
        Class<?> c2 = java.io.BufferedWriter.class;
//        case3)
        StringWriter in = new StringWriter();
        Class<?> c3 = in.getClass();
        
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
                
    }

}
