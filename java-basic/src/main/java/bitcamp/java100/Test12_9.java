package bitcamp.java100;
public class Test12_9{
    public static void main(String[] args) {    
       char c1 ; 
       c1 = 44032; //10진수
       char c2 = 0xAC00; //16진수

       System.out.println(c1);
       System.out.println(c2);

       char n1= 0xAE40, n2= 0xB2E4, n3= 0xC194;
      

       System.out.printf("%c %c %c\n", n1, n2, n3);
       //println으로는 안된다...!?

       n1 = '홍';
       n2 = '길';
       n3 = '동';
       System.out.printf("%c %c %c\n", n1, n2, n3);
       //작은 따옴표는 해당 글자의 유니코드 값을 리턴한다.
       //char는 유니코드를 이용한 문자의 코드값을 저장한다. "수"를 저장한다!!

       //문자 '7'을 숫자 7로 바꿔라!
       char x = '7';
    //    char y = '0';
       int num;
       num = x - '0'; //y가 와도됌
       System.out.println(num);
     
    }
}