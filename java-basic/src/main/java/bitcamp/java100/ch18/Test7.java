package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;

public class Test7 {
    public static void main(String[] args) throws Exception {
        // 1) 기본 생성자일땐 걍 newInstance()
        Class<?> clazz = X.class;
        X obj = (X)clazz.newInstance();
        System.out.println(obj.toString());

        System.out.println();
        // 2) 생성자를 이용한 객체생성
        Constructor<?> constructor = clazz.getConstructor(int.class);
        X obj2 = (X)constructor.newInstance(10);
        System.out.println(obj2.toString());
        
        System.out.println();
        constructor = clazz.getConstructor(String.class, int.class);
        X obj3 = (X)constructor.newInstance("홍길동", 20);
        System.out.println(obj3.toString());
                
        
    }
}
