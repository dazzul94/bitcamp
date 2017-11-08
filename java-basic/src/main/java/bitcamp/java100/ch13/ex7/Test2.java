package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Test2 {
    
    static void m1(int i) throws RuntimeException, Error, ArithmeticException, IndexOutOfBoundsException {
        switch (i) {
        case 1 : throw new RuntimeException();
        case 2 : throw new Error();
        case 3 : throw new ArithmeticException();
        case 4 : throw new IndexOutOfBoundsException();
        }
    }
    
    static void m2(int i) {
        switch (i) {
        case 1 : throw new RuntimeException();
        case 2 : throw new Error();
        case 3 : throw new ArithmeticException();
        case 4 : throw new IndexOutOfBoundsException();
        }
    }
    public static void main(String[] args)  {
     }
}
