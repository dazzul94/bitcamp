package bitcamp.java100;  
public class Test15_8{
    public static void main(String[] args) {
    //논리연산자
    // &&, ||, &, |
//AND 연산자(&&) : 둘다 참일때만 결과가 true
    System.out.printf("true && true = %b\n", true && true); 
    System.out.printf("true && false = %b\n", true && false); 
    System.out.printf("false && true = %b\n", false && true); 
    System.out.printf("false && false = %b\n", false && false); 
//OR 연산자(||) : 둘 중 한개라도 true 일때 결과가 true
    System.out.printf("true || true = %b\n", true || true); 
    System.out.printf("true || false = %b\n", true || true); 
    System.out.printf("false || true = %b\n", false || true); 
    System.out.printf("false || false = %b\n", false || false);

//한개 쓸때
    System.out.printf("true & true = %b\n", true & true); 
    System.out.printf("true & false = %b\n", true & false); 
    System.out.printf("false & true = %b\n", false & true); 
    System.out.printf("false & false = %b\n", false & false); 

    System.out.printf("true | true = %b\n", true | true); 
    System.out.printf("true | false = %b\n", true | true); 
    System.out.printf("false | true = %b\n", false | true); 
    System.out.printf("false | false = %b\n", false | false);

    // 차이점
    boolean b1 = false;
    boolean result = false && (b1 = true);
    System.out.printf("b1=%b, result=%b\n",b1, result);

    b1 = false;
    result = false & (b1 =true);
    System.out.printf("b1=%b, result=%b\n",b1, result);
    }
}