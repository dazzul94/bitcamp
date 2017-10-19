package bitcamp.java100;

import java.io.Console;

public class Test21_7_2 {
    static Console console;
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
    }
    
    static String inputString()  {
        String str = console.readLine("문자열? ");
        return str;
    }
    static StringBuffer stringToBuffer(String str) {
        StringBuffer buf = new StringBuffer();
        buf.append(str);
        return buf;
    }
    static void changePosition(StringBuffer buf) {
        int len = buf.length() / 2;
        
        for (int left = 0, right = buf.length() - 1; left < len; left++, right--) {
            char ch = buf.charAt(left);
            buf.setCharAt(left, buf.charAt(right));
            buf.setCharAt(right, ch);
        }
    }
    static void printBuffer(String str, StringBuffer buf) {
        System.out.printf("입력 문자열: %s\n", str);
        System.out.printf("변경 문자열: %s\n", buf);
    }
    public static void main(String[] args) {
        
        prepareConsole();
        String str = inputString();
        StringBuffer buf = stringToBuffer(str);
        changePosition(buf);
        printBuffer(str, buf);

    }
    
   
}

