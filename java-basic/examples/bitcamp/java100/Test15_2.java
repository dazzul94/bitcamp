package bitcamp.java100;  
public class Test15_2{
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        
    //    byte b3 = b1 - b2; //변수끼리의 연산은 안됌
        byte b3 = 10 - 20; //리터럴끼리의 연산은 ok

        short s1 = 10;
        short s2 = 20;
    // short s3 = s1 + s2; s1과 s2의 연산 결과는 int 니까 
        int r = s1 + s2; //ok
        long r2 = s1 + s2; // 결과 타입보다 더 큰 메모리는 ok
    }
}