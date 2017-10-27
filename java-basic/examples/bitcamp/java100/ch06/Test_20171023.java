package bitcamp.java100.ch06;
import java.io.Console;

public class Test_20171023 {
    static Console console;
    
    static Score_20171023 scores[] = new Score_20171023[10000];
    
    static int cursor; //= 0; 로컬변수 외에 클래스변수나 인스턴스 변수는 자동 0 으로 초기화됌 
    
    static void prepareScore() {
        console = System.console();
        if (console == null) {
            System.err.println("이클립스는 콘솔 지원을 하지 않습니다");
            System.exit(1); 
            }
        while(true) { //순서 잘 보고 생각해보기
            Score_20171023 score = new Score_20171023(
                    console.readLine("이름? "),
                    Integer.parseInt(console.readLine("국어 점수? ")),
                    Integer.parseInt(console.readLine("영어 점수? ")),
                    Integer.parseInt(console.readLine("수학 점수? "))
                    );

            scores[cursor++] = score;
//            cursor++;
            if (cursor == scores.length) {
                System.out.println("저장 최대개수를 초과했습니다");
                break;
            }
            
            if (!confirm("계속 입력하시겠습니까?")) {
                break;
            }
            
        }
    }
    
    static void printScore() {
        for (int i = 0; i < cursor; i++) {
            System.out.printf("%10s, %3d, %3d, %3d, %3d, %f5.2\n", 
                scores[i].name, 
                scores[i].kor, 
                scores[i].eng, 
                scores[i].math, 
                scores[i].sum, 
                scores[i].aver);
        }
    }
    static boolean confirm(String message) {
        String response = console.readLine(message).toLowerCase();
        if ((response.equals("y"))|| response.equals("yes")) {
            return true;
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        prepareScore();
        printScore();
    }

}
