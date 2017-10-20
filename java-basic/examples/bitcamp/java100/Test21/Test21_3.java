package bitcamp.java100.Test21;

import java.io.Console;

public class Test21_3 {
    public static void main(String[] args) {
        Console console = System.console();//미리 만들어진 메소드를 이용해서 객체를 얻는다(객체 생성과정이 넘나 복잡)
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        String name; //stack 메모리는 초기화를 꼭 해줘야함
        int age;
        boolean working;
        float gpa;
        //String으로 받아서 래퍼클래스를 이용해서 바꿔줘야함
        name = console.readLine("이름? (예: 홍길동) ");
        
        String value = console.readLine("나이? (예: 20) "); //걍한번에 하는게 좋음
        age = Integer.parseInt(value);
        
        working = Boolean.parseBoolean(console.readLine("재직여부?(예: true 또는 false) "));
        gpa = Float.parseFloat(console.readLine("졸업학점? (예: 4.15) "));
        
        System.out.println("---------------------------------");
        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
        System.out.printf("재직여부: %b\n", working);
        System.out.printf("졸업학점: %.2f\n", gpa);
    }      
}
