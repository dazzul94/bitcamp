package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GenericController<T> implements Controller{
    static Scanner keyScan = new Scanner(System.in);
    
    protected ArrayList<T> list = new ArrayList<>(); //필드로써 ArrayList 를 사용한다

//    public abstract void execute();
        
    
}
