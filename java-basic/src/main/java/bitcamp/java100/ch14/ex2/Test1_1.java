package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1_1 {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("sample/a.jpg");
        
        int b;
        
        int count = 0;
        while ((b = in.read()) != -1) {
            count++;
        }
        System.out.println(count);
        in.close();
        
    }

}