package bitcamp.java100;

import java.io.Console;

//Console 사용법(ctrl+shift+O)
public class Test21_2 {
    public static void main(String[] args) {
        //콘솔 객체를 만든다
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        //키보드로부터 한줄 입력 받는다.
        String line = console.readLine("입력하세요: ");
        System.out.println(line);
        
    }      
}
