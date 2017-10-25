import java.util.Scanner;

public class Score {
    String name;
    int[] subjects;
    int sum;
    float aver;

    
void input() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = scanner.nextLine();
        System.out.print("국어점수? ");
        this.subjects[0] = scanner.nextInt();
        System.out.print("영어점수? ");
        this.subjects[1]= scanner.nextInt();
        System.out.print("수학점수? ");
        this.subjects[2] = scanner.nextInt();
        
        this.compute();
    }

    Score() {
        this.subjects = new int[3];
    }
    
    //생성자
    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] {kor, eng, math};
        
        this.compute();
        
    }




    void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }

    void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
}
