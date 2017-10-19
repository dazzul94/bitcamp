// ## 키보드로부터 입력 받기 - 연습1
// - 다음과 같이 사용자로부터 구구단 번호를 입력 받아 출력하라!
// - 실행 예) 
// 구구단? 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// ...
// 2 * 9 = 18
// --------------------------
// 구구단? 10
// 2에서 9단까지만 가능합니다!
// 구구단? 1
// 2에서 9단까지만 가능합니다!
// 구구단? 0    <===== 0이하의 수를 입력하면 종료하라!
// 다음에 또 봐요!
// > 
package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    
    public static void main(String[] args) {
        
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        
        while(true) {
        int gugu = Integer.parseInt(console.readLine("구구단? "));
        if (gugu >= 2 && gugu <= 9) {
            for (int a = gugu, b = 1; b <= 9; b++) {
                    System.out.printf("%d * %d = %d\n", a, b, a * b);
            } 
            continue;
        } else if ((gugu >= 10) || (gugu == 1)) {
            System.out.println("2에서 9단까지만 가능합니다"); 
            continue;
        } else if (gugu <= 0) System.out.println("다음에 또 봐요!");
        break;
        }      
    }
}
