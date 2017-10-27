//클래스 문법의 용도 - 사용자 정의 데이터 타입
package bitcamp.java100.ch06.ex1;

public class Test10 {
    public static void main(String[] args) {
        
        Score9 score;
        score = new Score9();
        
        score = new Score9("홍길동");
        
        System.out.printf("이름= %s\n", score.name);
        System.out.printf("총점= %s\n", score.sum);
        System.out.printf("평균= %s\n", score.aver);

        
    }
}
