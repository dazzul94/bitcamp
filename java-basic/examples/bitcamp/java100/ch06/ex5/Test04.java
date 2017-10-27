package bitcamp.java100.ch06.ex5;
//클래스 멤버와 인스턴스 멤버의 활용 2
import java.util.Scanner;

public class Test04 {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String response = keyScan.nextLine().toLowerCase();
        if(response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        
        while(true) {
            Score1.inputScore();
            Score1.computeScore();
            Score1.printScore();

            if(!confirm("계속 하시겠습니까? "))
                break;
        }
    }

}
