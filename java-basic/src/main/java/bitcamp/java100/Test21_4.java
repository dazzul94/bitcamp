package bitcamp.java100;

import java.io.Console;

public class Test21_4 {
    
    public static void main(String[] args) {
        class Student { //메인에 쓸땐 static 안씀
            String name;
            int age;
            boolean working;
            float gpa;
        }
        Student s = new Student();
        
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        s.name = console.readLine("이름? (예: 홍길동) ");
        
        String value = console.readLine("나이? (예: 20) "); //걍한번에 하는게 좋음
        s.age = Integer.parseInt(value);
        
        s.working = Boolean.parseBoolean(console.readLine("재직여부?(예: true 또는 false) "));
        s.gpa = Float.parseFloat(console.readLine("졸업학점? (예: 4.15) "));
        
        System.out.println("---------------------------------");
        System.out.printf("이름: %s\n", s.name);
        System.out.printf("나이: %d\n", s.age);
        System.out.printf("재직여부: %b\n", s.working);
        System.out.printf("졸업학점: %.2f\n", s.gpa);
    }      
}
