package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test2 {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = StringWriter.class;
        // 1) 클래스이름 전부
        System.out.println(clazz.getName());
        // 2) SumpleName
        System.out.println(clazz.getSimpleName());
        // 3) 겟네임이랑 같음
        System.out.println(clazz.getTypeName());
        // 4) superClass
        Class<?> superClass = clazz.getSuperclass();
        System.out.println(superClass.getName());
    }

}
