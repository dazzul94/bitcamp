package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test1 {
    public static void main(String[] args) {
        //정상적으로 실행했든 예외가 발생했든 상관없이 자원해제를 시켜야할 경우
        FileReader in = null;
        try {
            in = new FileReader("./build.gradle");
            System.out.println("파일 읽기 준비 완료!");

            int ch;
            while(true) {
                ch = in.read();
                if(ch == -1) break; 
                System.out.print((char)ch);
                }
                System.out.println("-------------------");

        } catch (Exception e){ 
            System.out.println("파일 읽기 중 오류 발생!");

        } finally {
            System.out.println("finally 실행!");
            try { 
                in.close(); //close도 예외를 던질수있다
            } catch (Exception e) {}
        }
    }


}
