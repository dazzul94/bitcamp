package bitcamp.java100.ch13.ex1;

import java.io.Console;

public class Test3 {
    public static void main(String[] args) {
        Console console = System.console(); //console이 null 이클립스에서는 System.console()을 지원하지 않으니까

        if(console == null) {
            System.err.println("콘솔 입력을 지원하지 않습니다");
            System.exit(1);
        }

        while(true) {
            try { //예외 상황이 발생할 가능성이 있는 코드는 try 블록에 둔다
                int a = Integer.parseInt(console.readLine("a = "));
                String op = console.readLine("연산자? ");
                int b = Integer.parseInt(console.readLine("b = "));
                switch(op) {
                case "+" : System.out.printf("결과 = %d\n", a + b); break;
                case "-" : System.out.printf("결과 = %d\n", a - b); break;
                case "*" : System.out.printf("결과 = %d\n", a * b); break;
                case "/" : System.out.printf("결과 = %d\n", a / b); break;
                case "%" : System.out.printf("결과 = %d\n", a % b); break;
                default : System.out.println("지원하지 않는 연산자입니다");
                }
            } catch (Throwable err) {
                System.out.println("숫자 형식이 올바르지 않습니다");
                
            }

        }
    }

}
