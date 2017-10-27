package bitcamp.java100.ch06.ex3;


public class Test05 {
    static int v1 = 100;
    static void m1() {
        System.out.println("m1()");
    }
    
    int v2 = 200;
    void m2() {
        System.out.println("m2()");
    }

    public static void main(String[] args) {
        System.out.println(v1);
        m1();
//        System.out.println(v2);
//        m2();
        
        
        
        //스태틱 멤버에서 인스턴스 멤버를 사용하려면?
        Test05 obj1 = new Test05();
        obj1.v2 = 300;
        obj1.m2();
    }

}
