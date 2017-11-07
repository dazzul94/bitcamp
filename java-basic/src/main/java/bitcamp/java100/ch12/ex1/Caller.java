package bitcamp.java100.ch12.ex1;

public class Caller {
    public static void main(String[] args) {
        Protocol obj = new Callee();
//        Protocol obj2 = new String(); //String 클래스는 Protocol 인터페이스를 구현하지 않는다
        obj.m1();
        obj.m2();
        
    }

}
