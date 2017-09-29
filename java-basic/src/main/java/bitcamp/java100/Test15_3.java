package bitcamp.java100;  
public class Test15_3{
    public static void main(String[] args) {
        byte b1 = 20, b2 = 22;
        short s1 = 30, s2 = 33;
        int i1 = 40, i2 = 44;
        long l1 = 50, l2 = 55;
        float f1 = 3.14f, f2 = 45.32f;
        double d1 = 4567.8988, d2 = 9876.5432;
        //char는 short 랑 연산 같으니까 안함

        int r1 = b1 + s1; //int 
        r1 = b1 + i1;
        r1 = i1 + s1;

        // r1 = i1 + l1; long인데 int 에 담을 수 없다
        // r1 = b1 + l1;
        // r1 = s1 + l1;
        long r2 = i1 + l1;
        r2 = b1 + l1;
        r2 = i1 + l1;
        r2 = s1 + l1;
    
        // long r3 = b1 + f1; //float인데 long에 담을 수 없다.
        // r3 = s1 + f1;
        // r3 = i1 + f1;
        // r3 = l1 + f1;
        float r4 = b1 + f1;
        r4 = s1 + f1;
        r4 = i1 + f1;
        r4 = l1 + f1;
        // 주의: float 값에 다른 값을 더하면 float 의 크기르 넘을 수 있다
        // 이경우 실행오류 발생하지않고 값이 짤린다.

        // float r5 = f1 + d1; //compile 오류
        double r6 = f1 + d1;
        r6 = b1 + d1;
        r6 = s1 + d1;
        r6 = i1 + d1;
        r6 = l1 + d1;

        
    }
}