package bitcamp.java100;
//비트이동연산자 응용(>>,>>>,<<)
public class Test15_12_2{
    public static void main(String[] args) {
        //문제: int 메모리에 들어 있는 값을 1바이트 씩 출력하라
        int v = 1234567890;
        
        //전체 바이트를 16진수로 출력하기
        System.out.println(Integer.toHexString(v));
        
//        0XFF가 필터
        System.out.println(Integer.toHexString(v>>24));
        System.out.println(Integer.toHexString((v>>16) & 0xFF));
        System.out.println(Integer.toHexString((v>>8) & 0xFF));
        System.out.println(Integer.toHexString(v & 0xFF));
        }
}