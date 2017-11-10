package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1_2 {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("sample/jls9.pdf");
        
        int count = 0;
        int b = 0;
        
        long start = System.currentTimeMillis();
        while ((b = in.read()) != -1) {
            count ++;
        }
        long end = System.currentTimeMillis();
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린 시간 = %d\n", (end - start));
        in.close();
        
    }

}