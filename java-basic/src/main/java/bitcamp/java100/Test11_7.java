package bitcamp.java100;
public class Test11_7 {
    public static void main(String[] args) {
        //자바는 2의 보수 방식으로 메모리에 저장한다~~

        //양의 정수값을 이렇게 메모리에 저장
        //=> 100 = 0000 0000 0000 0000 0000 0110 0100
        System.out.println(100);
        System.out.println(Integer.toBinaryString(100));


        //음의 정수값을 이렇게 메모리에 저장
        // -100= 1111 1111 1111 1111 1111 1111 1001 1100
        //100을 뒤집어서 +1을 한다
        System.out.println(-100);
        System.out.println(Integer.toBinaryString(-100));
    }
}