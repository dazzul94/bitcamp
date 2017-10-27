package bitcamp.java100.ch06.ex2;

import java.io.Console;

public class Test02 {

    static Console console;

    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1);
        }
    }

    

    public static void main(String[] args) {
        prepareConsole();

        while(true) {

            Score score = new Score();

            Scoreview.input(score);

            ScoreDao.add(score);
            if (!MessageBox.confirm("계속 하시겠습니까?")) {
                break;
            }
        }

        for(int i = 0; i < ScoreDao.size(); i++) {
            Scoreview.print(ScoreDao.get(i));
        }
    }
}
