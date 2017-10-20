package bitcamp.java100.ch06.ex1;
//기본생성자 (default operator)-파라미터가 없는 생성자이다
public class Score6 {
    //필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    Score6() {
        System.out.println("기본 생성자 호출됌!");
    } //로 초기화됌
    
    void compute() { 
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
