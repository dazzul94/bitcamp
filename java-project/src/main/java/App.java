import java.util.Scanner;

public class App {

    static boolean confirm(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String response = scanner.nextLine().toLowerCase();

        if(response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        ScoreDao scoreDao = new ScoreDao();

        while(true) {
            Score score = new Score();
            score.input();
            scoreDao.add(score);
        if(!confirm("계속 입력하시겠습니까? (y/n)")) 
            break;
        }
        
        for (int i = 0; i < scoreDao.size(); i++) {
            scoreDao.get(i).print();
        }
    }
}




