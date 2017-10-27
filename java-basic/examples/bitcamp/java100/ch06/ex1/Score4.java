package bitcamp.java100.ch06.ex1;
//특별한 인스턴스 메서드(생성자)-파라미터가 있는
public class Score4 {
    //필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //매서드 정의( =연산자 정의)- sum과 aver를 다루기 위해 만듦
    void compute() { //어차피 주소주니까 파라미터 없어도됌
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    Score4(String name, int kor, int eng, int math) {
        System.out.println("Score4 호출됌");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.compute();
    }

}
