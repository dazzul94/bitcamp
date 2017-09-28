package bitcamp.java100;
public class Test12_1 {
    public static void main(String[] args) {
        //"데이터 타입 = 변수명"
        // = 는 assignment 할당연산자, 배정연산자~
//자바 원시 타입 메모리 준비하기
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean bool;
        char c;

// 메모리에 값 저장하기 '=' 연산자 사용
        b = 100;
        s = 100;
        i = 100;
        l = 100;
        f = 3.14f; //f 꼭 붙여야함
        d = 3.14;
        bool = true;
        c = 44032;
        // 100 = a ; error

// 메모리에 저장된 값 출력하기

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);
    }
}