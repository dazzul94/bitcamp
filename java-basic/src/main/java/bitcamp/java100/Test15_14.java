package bitcamp.java100;

public class Test15_14{
    public static void main(String[] args) {
        //char 데이터와 명시적 형변환
        // 정수 값을 유니코드로
        char v1 = 44032;
        System.out.println(v1);
        
        
        int v2 = 44032;
        System.out.println(v2);
        
        //int 메모리에 들어있는 값을 문자로 출력하기
        //(명시적 형변환)
        System.out.println((char)v2);
    }
}