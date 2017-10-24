package bitcamp.java100.ch06.ex4;
//클래스 멤버와 인스턴스 멤버의 활용
public class Test07 {
    //7단계 : 인스턴스 메서드를 사용하여 인스턴스 멤버를 보다 쉽게 다룰 수 있다
    //        내장변수 this !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //        메서드를 호출 할 떄도 메서드 앞에 인스턴스 주소를 주기 때문에 어떤 인스턴스에 대해 작업을 수행하는지
    //        직관적으로 알 수 있다
    
    public static void main(String[] args) {
        //2 + 5 * 3 - 7 / 2 
        //3 * 6 - 5 + 11 / 2

        Calculator3 that1 = new Calculator3();
        Calculator3 that2 = new Calculator3();
        
        that1.plus(2); //초기값이 0 이니까 2 첨에 더해줌
        that1.plus(5);
        that1.multiple(3);
        that1.minus(7);
        that1.devide(2);

        System.out.println(that1.result);

        
        that2.plus(3);
        that2.multiple(6);
        that2.minus(5);
        that2.plus(11);
        that2.devide(2);
        
        System.out.println(that2.result);
    }

}
