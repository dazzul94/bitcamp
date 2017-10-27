package bitcamp.java100.ch06.ex1;
//새 데이터 타입을 만들었으니
//자연스럽게 새 데이터를 다루는 연산자를 정의한다(메서드 선언)
public class Score2 {
    //필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //매서드 정의( =연산자 정의)- sum과 aver를 다루기 위해 만듦
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
