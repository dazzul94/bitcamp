package bitcamp.java100;

import java.io.Console;

public class Test21_6 {
    
    public static void main(String[] args) {
        Console console1 = System.console();
        if (console1 == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        
        int i1 = Integer.parseInt(console1.readLine("구구단? "));
        for (int x = i1, y = 1;y <= 9;y++) {
            System.out.printf("%d * %d = %d\n", x, y, x * y);
        }
        
        System.out.println("---------------------------------");
        
        Console console2 = System.console();
        if (console2 == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        
        int i2 = Integer.parseInt(console2.readLine("구구단? "));
                if(i2 == 10) {
                    System.out.println("2에서 9단까지만 가능합니다");
                } else if(i2 == 1) { 
                    System.out.println("2에서 9단까지만 가능합니다");
                } else if(i2 == 0 || i2 < 0)
                    System.out.println("다음에 또 봐요!");
                }
}      
