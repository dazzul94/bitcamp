package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine().toLowerCase();
        
        try {
            System.out.println("try 블록 실행!");
            switch(str) {
            case "a" : throw new Exception();
            //break; 안해줘도 됌 어차피 Exception에 걸리면 catch로 가니까
            case "b" : throw new IOException();
            case "c" : throw new FileNotFoundException();
            case "d" : throw new SQLException();
            }
            System.out.println(str);

        } catch(IOException|SQLException e) {
            System.out.println("SQL Exception 처리");
            
        } catch(Exception e) {
            System.out.println("Exception 예외처리");
        }

    }
}
