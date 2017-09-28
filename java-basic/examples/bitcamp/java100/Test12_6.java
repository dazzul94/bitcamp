package bitcamp.java100;
public class Test12_6 {
    public static void main(String[] args) {    
        
        byte b1 = 50;
        byte b2 = 50;
        byte b3;
        b3= 100;

        // b3 = b1+b2; error: int to byte 
        // 리터럴을 직접 넣지 않을때는 허락하지 않는다 변수끼리 연산하는건 안됌
        
        b3 =50 +50; //리터럴과 리터럴의 연산 OK

        // b3 =b1 +50; 리터럴과 변수의 연산 결과도 그냥 일반 int 값으로 간주한다

        short s1;
        // s1 =b1+b2; //자바의 최소 연산 단위가 4바이트기 때문에 변수끼리의 연산에 의한 4바이트 값은 short에 저장할 수 없다
        }
}