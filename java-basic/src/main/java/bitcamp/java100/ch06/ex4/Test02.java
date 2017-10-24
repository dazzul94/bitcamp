package bitcamp.java100.ch06.ex4;
//클래스 멤버와 인스턴스 멤버의 활용
public class Test02 {
    //2단계 : 메서드 분리
    static int plus(int a, int b) {
        return a + b;
    }
    static int multiple(int a, int b) {
        return a * b;
    }
    static int minus(int a, int b) {
        return a - b;
    }
    static int devide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //2 + 5 * 3 - 7 / 2 
        
        int result;

        result = plus(2, 5);
        result = multiple(result, 3);
        result = minus(result, 7);
        result = devide(result, 2);

        System.out.println(result);


    }

}
