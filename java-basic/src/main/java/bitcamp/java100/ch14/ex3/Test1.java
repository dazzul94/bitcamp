package bitcamp.java100.ch14.ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test1 {
    
    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);
        
        FileOutputStream out = new FileOutputStream("test.1.dat");
        
        out.write(s.getName().getBytes("UTF-8"));
        out.write(s.getKor());
        out.write(s.getEng());
        out.write(s.getMath());
        out.write(s.getSum());
//        out.write((int) s.getAver());
        out.close();
    
    
    }

}
