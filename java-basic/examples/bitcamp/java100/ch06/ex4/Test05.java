package bitcamp.java100.ch06.ex4;
//클래스 멤버와 인스턴스 멤버의 활용
public class Test05 {
    //5단계 : static 변수의 한계
    
    public static void main(String[] args) {
        //2 + 5 * 3 - 7 / 2 
        //3 * 6 - 5 + 11 / 2

        Calculator1.plus(2); //초기값이 0 이니까 2 첨에 더해줌
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.devide(2);

        System.out.println(Calculator1.result);

        Calculator1.result = 0;
        Calculator1.plus(3);
        Calculator1.multiple(6);
        Calculator1.minus(5);
        Calculator1.plus(11);
        Calculator1.devide(2);
        
        System.out.println(Calculator1.result);
    }

}
