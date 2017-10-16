package bitcamp.java100;
//메서드
//로컬 변수와 스택 메모리의 관계를 알아보자
public class Test17_12 {
    static void m1(int value) {//로컬변수 value가 만들어진다
        value += 50;
        System.out.printf("m1(): %d\n",value);
    }
   
    public static void main(String[] args) { //args메모리 만들어진다
        int value = 100;
        m1(value);
        System.out.printf("main(): %d\n", value);
    }      
}
