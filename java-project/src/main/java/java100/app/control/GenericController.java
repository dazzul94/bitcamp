package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class GenericController<T> implements Controller {
    
    static Scanner keyScan = new Scanner(System.in);
    
    protected ArrayList<T> list = new ArrayList<>();

    // Controller 인터페이스로부터 execute()라는 추상 메서드를 
    // 물려 받았기 때문에 여기서 또 선언해서는 안된다.
    //public abstract void execute();
    
}









