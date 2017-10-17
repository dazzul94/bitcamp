package bitcamp.java100;
//메서드
//로컬 변수와 스택 메모리의 관계를 알아보자
public class Test17_13 {
    static void m1(int value) {
        value += 50;
        m2(value);
        System.out.printf("m1(): %d\n",value);//
    }
    static void m2(int value) {
        value += 40;
        m3(value);
//        m3(value); 호출하고 쓰고 제거되고
//        m3(value); 호출하고 쓰고 제거되고
//        m3(value); 호출하고 쓰고 제거되고
        System.out.printf("m2(): %d\n",value); //13줄로 돌아와서 실행되고 stack 메모리 사라짐
    }
    static void m3(int value) {
        value += 30;
        System.out.printf("m3(): %d\n",value);//실행하면 stack 메모리 사라짐(호출이 끝나면)
    }
    public static void main(String[] args) {
    int value = 100;
    m1(value);
    System.out.printf("main(): %d\n", value);
    }      
}
