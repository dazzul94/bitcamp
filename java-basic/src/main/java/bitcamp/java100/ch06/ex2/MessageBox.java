package bitcamp.java100.ch06.ex2;

import java.io.Console;

public class MessageBox {
    
    static boolean confirm(String message) {
        Console console = System.console();//다른데서 system.console 해도 똑같음 하나의 콘솔임
        
        String response = console.readLine(message).toLowerCase();
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }

}
