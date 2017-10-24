package bitcamp.java100.ch06.ex4;
//클래스 멤버와 인스턴스 멤버의 활용
public class Test03 {
    //3단계 : 스태틱 변수 사용
    static int result;
    //스태틱 메서드에서 공유하는 값는 스태틱 메서드로!!!!!!!!!!
    //인스턴스 변수나 static 변수는 초기화안하면 0으로 초기화된다
    
    
    static void plus(int value) {
        result +=value;
    }
    static void multiple(int value) {
        result *=value;
    }
    static void minus(int value) {
        result -=value;
    }
    static void devide(int value) {
        result /=value;
    }

    public static void main(String[] args) {
        //2 + 5 * 3 - 7 / 2 

        plus(2); //초기값이 0 이니까 2 첨에 더해줌
        plus(5);
        multiple(3);
        minus(7);
        devide(2);

        System.out.println(result);


    }

}
