package bitcamp.java100;
//메서드
public class Test17_7{
    // 6) 타입이 다른 여러개의 값을 반환하는 방법
//    컬렉션 객체(상자)에 담아서 반환한다
    static java.util.ArrayList m1() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("홍길동");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');
        
        return list;
    }
    public static void main(String[] args) {//Object는 거시기
        java.util.ArrayList a = m1();
        for(Object v : a) {
            System.out.println(v);
        }
    }
}
