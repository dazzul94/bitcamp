package bitcamp.java100;  
public class Test15_10{
    public static void main(String[] args) {
    //비트연산자(& ,| ,~ , ^)
        int v1 = 0b0101_1100;
        int v2 = 0b0110_0110;
        
        
        //&(논리곱 AND)
        // 각 비트끼리 AND 연산을 수행한다.
        int result = v1 & v2; //&&쓰면 안됌(논리연산자니까)
        System.out.println(java.lang.Integer.toBinaryString(result));
        
        //|(논리합 OR)
        result = v1 | v2; //||쓰면 안됌(논리연산자니까)
        System.out.println(java.lang.Integer.toBinaryString(result));
        
        //^(배타적 논리곱 OR)-exclusive OR(XOR)
        result = v1 ^ v2; //두개 비트의 값이 다를때
        System.out.println(java.lang.Integer.toBinaryString(result));
    
        //~(부정) NOT: 비트값을 반대값으로 바꾼다
        result = ~v1; //
        System.out.println(java.lang.Integer.toBinaryString(result));
    }
}