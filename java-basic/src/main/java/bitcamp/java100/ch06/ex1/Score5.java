package bitcamp.java100.ch06.ex1;
//여러개의 생성자
public class Score5 {
    //필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    void compute() { 
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    //생성자 파라미터 조합만 다르면 여러개 만들 수 있다.
    //1)파라미터 없을떄
    Score5() {
        System.out.println("Score5() 호출됌");
        this.name = "홍길동";
        this.kor = 50;//시험안봐도 50점줌
        this.eng = 50;
        this.math = 50;

        this.compute();
    }
    //2)String
    Score5(String name) {
        System.out.println("Score5(String) 호출됌");
    }
    //3)String, int, int, int
    Score5(String name, int kor, int eng, int math) {
        System.out.println("Score5(name, int, int) 호출됌");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.compute();
    }

}
