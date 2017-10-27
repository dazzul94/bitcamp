//클래스 문법의 용도 - 사용자 정의 데이터 타입
package bitcamp.java100.ch06.ex1;

public class Test05 {
    public static void main(String[] args) {
        
        Score4 score;
        
//        score = new Score4(); //메모리의 주소를 레퍼런스에 저장
        
//        score = new Score4("홍길동");
        
        score = new Score4("임꺽정", 100, 80, 70);
        
        System.out.printf("이름= %s\n", score.name);
        System.out.printf("총점= %s\n", score.sum);
        System.out.printf("평균= %s\n", score.aver);

        
    }
}
