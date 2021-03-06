// ## 키보드로부터 입력 받기 - 연습3
// - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
// - 실행 예) 
// 문자열? AB2CTT980
// 입력한 값: AB2CTT980
// 꺼꾸로 바꾼 값: 089TTC2BA
// > 
package bitcamp.java100.Test21;

import java.io.Console;

public class Test21_7_My {
    
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        String s1 = console.readLine("문자열? ");
        System.out.printf("입력한 값: %s\n",s1);
        String[] s2 = s1.split("");
        System.out.print("거꾸로바꾼값: ");
        for (int i = s2.length-1; i >= 0; i--) 
            System.out.print(s2[i]);
    }
}      
