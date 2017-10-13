package bitcamp.java100;
//메서드
// 3) 0개 이상의 아규먼트를 받을 수 있는 파라미터 선언하기
public class Test17_4{
    static void m1(int...values) {
        System.out.printf("아규먼트 개수: %d\n",values.length);
        for(int v : values)
            System.out.println(v);
    }
    //    static void m2(int a, int b, int c) {
//    }//같은 타입이어도 따로 선언
    
    // 가변길이 파라미터는 only 한개만 선언
//    static void m2(int... values, int... values2) {} int가 몇갠지 알 수가 없다
//    static void m2(int... values, String... values2) {} String 와도 소용없다
    
    //가변파라미터를 젤 나중에 써야함
    static void m3(String name, int age, int... values) {}
//    static void m3(int age, int... values, String name) {}
//    static void m3(int... values, String name, int age) {}
    
    static void m4(int... values) {
        int s = 0;
        for (int v : values) {
            s += v;
        }
        System.out.printf("합계: %d\n", s);
        
    }
    public static void main(String[] args) {
        m1();
        m1(1);
        m1(13,1);
        m1(2,2,4);
        
        m4();
        m4(1,3);
        m4(2,34,1);
        m4(1,3,42,5);
    }
}
