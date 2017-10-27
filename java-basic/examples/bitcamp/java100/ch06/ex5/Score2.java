package bitcamp.java100.ch06.ex5;

import java.util.Scanner;
//인스턴스 변수 this 안 붙이면 컴파일시 자동으로 붙는다
public class Score2 {
    
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    void input() {

        Scanner keyScan = new Scanner(System.in);

        System.out.print("이름? ");
        this.name = keyScan.nextLine();

        System.out.print("국어점수? ");
        this.kor = keyScan.nextInt();

        System.out.print("영어점수? ");
        this.eng = keyScan.nextInt();

        System.out.print("수학점수? ");
        this.math = keyScan.nextInt();
        
        this.compute(); 

//        keyScan.close();
    }
    
    void compute(){
        this.sum = this.kor + this.eng + this.math;
        this.aver= this.sum / 3f;
    }
    
    void print() {
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                this.name, this.kor, this.eng, this.math ,this.sum, this.aver);

    }

}
