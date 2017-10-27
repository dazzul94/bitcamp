package bitcamp.java100.ch06.ex3;

import java.io.Console;

public class Test01 {
    public static void main(String[] args) {
        //스태틱 변수사용
        //클래스명.변수명 = 값;
        
//        Console console = System.console(); 
//        console.readLine("계속 실행하려면 엔터를 치세요");
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!"); //system.console이 객체를 만드니까 그 객체에 대해서
                                                                     //readLine이니까 Ok(메소드의 리턴값에 대해 메소드를 호출)
        
        System.out.println(MyClass.v1);
        
        MyClass.v1 += 200;
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!");
        
        System.out.println(MyClass.v1);
        
    }

}
