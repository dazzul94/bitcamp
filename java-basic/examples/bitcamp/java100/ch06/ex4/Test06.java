package bitcamp.java100.ch06.ex4;
//클래스 멤버와 인스턴스 멤버의 활용
public class Test06 {
    //6단계 : 메서드를 실행할 때 개별적으로 관리되어야 할 값이 있다면 인스턴스 변수에 저장하라
    
    public static void main(String[] args) {
        //2 + 5 * 3 - 7 / 2 
        //3 * 6 - 5 + 11 / 2

        Calculator2 that1 = new Calculator2();
        Calculator2 that2 = new Calculator2();
        
        Calculator2.plus(that1, 2); //초기값이 0 이니까 2 첨에 더해줌
        Calculator2.plus(that1, 5);
        Calculator2.multiple(that1, 3);
        Calculator2.minus(that1,7);
        Calculator2.devide(that1, 2);

        System.out.println(that1.result);

        
        Calculator2.plus(that2,3);
        Calculator2.multiple(that2,6);
        Calculator2.minus(that2,5);
        Calculator2.plus(that2,11);
        Calculator2.devide(that2,2);
        
        System.out.println(that2.result);
    }

}
