package bitcamp.java100.ch13.ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {

    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
    }

    static ArrayList<Score> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);

    static void input() throws Exception {
        Score score = new Score();
        System.out.print("이름? ");
        score.name = keyScan.nextLine();

        if(score.name.length() == 0) {
            throw new EmptyStringException();
        }

        System.out.print("국어? ");
            score.kor = Integer.parseInt(keyScan.nextLine());
            if(score.kor < 0 || score.kor > 100) 
                throw new ScoreOutOfBoundsException();

        System.out.print("영어? ");
            score.eng = Integer.parseInt(keyScan.nextLine());
            if(score.eng < 0 || score.eng > 100) 
                throw new ScoreOutOfBoundsException();

        System.out.print("수학? ");
            score.math = Integer.parseInt(keyScan.nextLine());
            if(score.math < 0 || score.math > 100) 
                throw new ScoreOutOfBoundsException();

        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;

        list.add(score);
        System.out.println("잘못 입력하셨습니다");
        
    }
    static void print() {
        for(Score s : list) {
            System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                    s.name, s.kor, s.eng, s.math, s.sum, s.aver);
        }
    }

    static void m1() throws Exception {
        throw new Exception();
    }
    static void m2() throws Exception {
        System.out.println("예외가 발생했어요!");
        throw new Exception("예외가 발생한 이유는..");
    }

    public static void main(String[] args) {
        while(true) {
            try {
                input();
            } catch (EmptyStringException e) {
                System.out.println("입력 문자열이 비어 있습니다");
            } catch (ScoreOutOfBoundsException e) {
                System.out.println("점수의 범위를 벗어났습니다");
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식이 아닙니다");
            } catch (Exception e) {
                e.printStackTrace(); //상세한 조사
            }
            System.out.print("계속 하시겠습니까?(Y/n)");
            String response = keyScan.nextLine().toLowerCase();
            if(response.equals("")|| response.equals("y")|| response.equals("yes")) { 
                continue;
            }
            break;
        }
        System.out.println();
        print();
    }

}
