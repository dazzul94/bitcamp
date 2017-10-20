package bitcamp.java100.Test21;

import java.io.Console;

public class Test21_6 {

    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        StringBuffer buf = new StringBuffer(console.readLine("숫자? "));
        
        int[] cnt = new int[10];
        
        for (int i = 0; i < buf.length(); i++) {
            cnt[buf.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < cnt.length; i++) {
            System.out.printf("%d = %d\n", i, cnt[i]);
        }
        
    }
}