package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    
    public static void main(String[] args) {
        
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        int gugu = Integer.parseInt(console.readLine("구구단? "));
        
        for (int x = gugu, y = 1; y <= 9; y++) {
            if (x <= 9 & x >= 2) {  
                System.out.printf("%d * %d = %d\n", x, y, x * y);
            } else if (x == 1) { 
                System.out.println("2에서 9단까지만 가능합니다!");
            } else if (x == 10) {
                System.out.println("2에서 9단까지만 가능합니다!");
            } else if (x == 0) {
                System.out.println("다음에 또 봐요!");
            }
        }
        
    }      
}
