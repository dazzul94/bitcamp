import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
public class App2 {
    static ArrayList<Score> list = new ArrayList<>();
    
    static Object view(String name, ArrayList<Score> list) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("이름?");
        String input = keyScan.nextLine();
        Score ext = new Score();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).name.equals(name))
                ext = list.get(i);
        }
        return ext;
    }
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("\n"))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        
        
        Scanner keyScan = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("성적관리>");
            String input = keyScan.nextLine();
            System.out.println(input);
            System.out.println();
            Score score = new Score();
            
            if(input.equals("add")) {
                score.add();
                list.add(score);
                System.out.print("계속 입력하시겠습니까?");
                input = keyScan.nextLine();
                
            } else if(input.equals("list")) {
                Iterator<Score> iterator = list.iterator();
                while(iterator.hasNext()) {
                    iterator.next().list();
                }
            } else if(input.equals("view")) {
                System.out.print("이름?");
                input = keyScan.nextLine();
                view(input, list);
                
                
            } else if(input.equals("delete")) {
                System.out.print("이름?");
                input = keyScan.nextLine();
                
            } else if(input.equals("update")) {
                System.out.print("이름?");
                input = keyScan.nextLine();
            }
                
            /*
            Score score = new Score();
            score.add(); 
            
            list.add(score);

            if (!confirm("계속하시겠습니까? "))
                break;
        }*/
//        Iterator<Score> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            iterator.next().print();
        }
    }
}
