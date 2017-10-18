// 
//


package bitcamp.java100;

import java.io.Console;

public class Test21_5BOM {
    public static void main (String[] args)  { 
        class ggd{
            int x;
        }

        Console console = System.console();
        
        ggd g = new ggd();
        g.x= Integer.parseInt(console.readLine("구구단 ?"));
        
        if( 1<g.x && g.x<10) {
                System.out.printf("[%d단]\n", g.x);

                for(int j =1; j <10; j++) {
                    System.out.printf("%d x %d = %d\n",g.x,j,g.x*j);
                }
                System.out.println("------------------------");
        }
        
        else if(g.x<0) System.out.println("다음에 또 봐요");
        else System.out.println("2에서 9단까지만 가능합니다!");
        
    }
}