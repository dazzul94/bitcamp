package bitcamp.java100.ch06.ex3;
 
public class MyClass3 {
    
    
    static int v1 = 100;   //스태틱 변수 
    static void m1() {     //스태틱 메서드
        System.out.println(v1);
    }
    
        //스태틱 블록: 스태틱 변수를 초기화시켜야만 할때
    static {
        System.out.println("MyClass3의 static 블록 실행!");
        v1 = 300;
    }
    static {
        System.out.println("MyClass3의 static 블록 실행2222!");
        v1 = 300;
    }
}
