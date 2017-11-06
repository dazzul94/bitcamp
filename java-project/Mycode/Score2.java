package Mycode;
import java.util.Scanner;

public class Score2 {  
    
    Scanner keyScan = new Scanner(System.in);
    
    protected String name;
    protected int[] subjects; 
    protected int sum;
    protected float aver;

    public Score2() {
        this.subjects = new int[3];
    }
    public Score2(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    

    private void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        } 
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    
    
    
    public void list() {
        System.out.printf("%s, %4d, %6.1f\n",  
                this.name,
                this.sum, 
                this.aver);
    }
    
    public void add() {
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("국어점수? ");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("영어점수? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학점수? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
        
        
    }
}
