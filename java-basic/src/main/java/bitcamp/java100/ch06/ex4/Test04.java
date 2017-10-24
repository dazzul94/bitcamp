package bitcamp.java100.ch06.ex4;
//클래스 멤버와 인스턴스 멤버의 활용
public class Test04 {
    //4단계 : 클래스 분리: 계산을 수행하는 코드를 별도의 클래스로 분류해두면 재사용
    
    public static void main(String[] args) {
        //2 + 5 * 3 - 7 / 2 

        Calculator1.plus(2); //초기값이 0 이니까 2 첨에 더해줌
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.devide(2);

        System.out.println(Calculator1.result);


    }

}
