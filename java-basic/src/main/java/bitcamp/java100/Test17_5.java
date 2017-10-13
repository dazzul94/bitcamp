package bitcamp.java100;
//메서드
public class Test17_5{
    // 4) 값을 반환하는 메서드
    
    //=>문자열을 반환하는 메서드
    static String m1() {
        return "Hello";
    }
    //=>숫자를 반환하는 메서드
    static int m2() {
        return 100; 
    }
    static boolean m3() {
        return true;
    }
    static int m6() {
        return 100; //여기서 작업이 끝나기 때문에 뒤의 코드는 의미가 없다
//        int a = 100;
//        a++;
    }
    public static void main(String[] args) {
        String v = m1();
        System.out.println(v);
        System.out.println(m1());
    }
}