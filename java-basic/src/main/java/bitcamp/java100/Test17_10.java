package bitcamp.java100;
//메서드
//7) 값을 받아서 계산한 후 그 결과를 리턴하는 메서드
public class Test17_10 {
    static void m1() {
        System.out.println("m1() ----> ");
        m2();
        System.out.println("m1() <----");
    }
    static void m2() {
        System.out.println("    m2() ----> ");
        m3();
        System.out.println("    m2() <----");
    }
    static void m3() {
        System.out.println("        m3() ----> ");
        m4();
        System.out.println("        m3() <----");
    }
    static void m4() {
        System.out.println("            m4()...");
//        while (true) {} 중간중간 무한루프 넣어서 어디서 끊기나 확인
    }
    
    //Eclipse IDE 디버그 기능
    public static void main(String[] args) {
        System.out.println("main()===> ");
        m1();
        System.out.println("main()<=== ");
    }      
}
