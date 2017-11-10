package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
        
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("sample/b.jpg");
        
        FileOutputStream out = new FileOutputStream("sample/b2.jpg");
        
        int b;
        
        int count = 0;
        while ((b = in.read()) != -1) {
            count++;
        }
        System.out.println(count);
        in.close();
        out.close();
        System.out.println("파일 복사 완료했음!");
        
    }

}