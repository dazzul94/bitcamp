package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {
    public static void main(String[] args) {
//        1) 같은 패키지
        A obj = new A();
        
//        2) 다른 패키지
        bitcamp.java100.ch10.ex1.other.B obj2 = new bitcamp.java100.ch10.ex1.other.B();
//        other.B obj3 = new other.B();
        
        C obj3 = new C();
        
//        D obj4 = new D(); //위치를 적어줘도 안됌
        
        E obj4 = new E();
        F obj5 = new F();
        G obj6 = new G();
    }
}
