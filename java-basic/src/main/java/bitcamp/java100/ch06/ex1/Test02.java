//클래스 문법의 용도 - 사용자 정의 데이터 타입
package bitcamp.java100.ch06.ex1;

public class Test02 {
    public static void main(String[] args) {
        
        Score score;
        score = new Score(); //메모리의 주소를 레퍼런스에 저장
        
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;

    }
}
