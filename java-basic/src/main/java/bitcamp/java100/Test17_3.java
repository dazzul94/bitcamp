package bitcamp.java100;
//메서드
public class Test17_3{
    //2) 파라미터가 있는 메서드
    static void m1(String name) {
        System.out.printf("%s님 반갑습니다!\n", name);
    }
    static void m2(String name, int age) {
        System.out.printf("%s(%d)님 반갑습니다\n", name, age);
    }
    public static void main(String[] args) {
       //정의한 메소드 사용(호출)

        m1 ("홍길동");
        m1 ("임꺽정");
        m1 ("유관순");
//        m1(100);
//        int r = m1();
        
        m2 ("김다솔", 24);
        m2 ("김이든", 25);
    }
}
