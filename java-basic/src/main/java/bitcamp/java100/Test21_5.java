package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    
    public static void main(String[] args) {
//       while (true) { 
           
           Console console = System.console();
           
           if (console == null) {
           System.err.println("콘솔을 지원하지 않습니다");
           System.exit(1); //JVM을 종료한다
           
           String fuck = console.readLine("구구단? ");
//           break;
//           for (int x = i, y = 1;y <= 9;y++) {
//               System.out.printf("%d * %d = %d\n", x, y, x * y);
//               if(i2 == 10) {
//                   System.out.println("2에서 9단까지만 가능합니다");
//               } else if(i2 == 1) { 
//                   System.out.println("2에서 9단까지만 가능합니다");
//               } else if(i2 == 0 || i2 < 0)
//                   System.out.println("다음에 또 봐요!");

           }
           
    }
}
