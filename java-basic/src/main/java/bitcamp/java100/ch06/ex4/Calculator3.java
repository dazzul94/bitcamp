package bitcamp.java100.ch06.ex4;

public class Calculator3 {
    //계산 결과를 여러개 개별적으로 관리하기 위해 인스턴스 변수로 전환한다
    int result; 
    
    //인스턴스 메서드로 전환!
    //인스턴스 주소를 받기 위한 파라미터 주소를 선언할 필요가 없다
    //이미 this 라는 내장변수가 있다
    void plus(int value) {
        this.result +=value;
    }
    void multiple(int value) {
        this.result *=value;
    }
    void minus(int value) {
        this.result -=value;
    }
    void devide(int value) {
        this.result /=value;
    }


}
