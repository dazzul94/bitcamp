package bitcamp.java100;  
public class Test15_5{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        a = a + 1; 
        b = b - 1;

        System.out.printf("a= %d, b= %d\n", a, b);

        // 1) 전위 (prefix) 증감연산자
        a = 10;
        b = 10;

        ++a; // a = a + 1 
        --b; // b = b - 1
        System.out.printf("a= %d, b= %d\n", a, b);
        
        // 2) 후위 (postfix) 증감연산자
        a = 10;
        b = 10;

        a++; // a = a + 1 
        b--; // b = b - 1
        System.out.printf("a= %d, b= %d\n", a, b);
        
        //결과 똑같다...... 
        //prefix와 postfix의 차이점
        
        //prefix
        a = 10;
        b = 10;

        int r1 = ++a;
        int r2 = --b;
        System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);
        
        //postfix
        a = 10;
        b = 10;

        r1 = a++;
        r2 = b--;
        System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);
   
        //postfix의 또다른 예
        a = 10;
        a = ++a;
        System.out.println(a);

        b = 10;
        b = b++;
        System.out.println(b);

        //다른 연산자와 섞었을 때
        a = 5;
        r1 = ++a + ++a * ++a; //증감 연산자가 더 우선
        System.out.printf("a=%d, r1=%d\n", a, r1);

        // ++a++;
        // System.out.println(a);

        a = 5;
        r1 = a++ + a++ * a++; //증감 연산자가 더 우선
        System.out.printf("a=%d, r1=%d\n", a, r1);
    }
}