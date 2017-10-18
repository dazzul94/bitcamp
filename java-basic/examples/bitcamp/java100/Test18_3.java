package bitcamp.java100;
public class Test18_3 {
    //String 클래스 - 암시적 , 명시적
    public static void main(String[] args) {
       //암시적 - constants pool 에 생성된다.
       String s1 = "ABC가각간"; 
       String s2 = "ABC가각간";
       String s3 = "ABC가각간";
       
       //명시적 - Heap 에 생성된다
       String s4 = new String("ABC가각간");
       String s5 = new String("ABC가각간");
       String s6 = new String("ABC가각간");
       
       if (s1 == s2) System.out.println("s1 == s2");
       if (s1 == s3) System.out.println("s1 == s3");
       
       if (s1 != s4) System.out.println("s1 != s4");
       if (s1 != s5) System.out.println("s1 != s5");
       if (s1 != s6) System.out.println("s1 != s6");

       if (s4 != s5) System.out.println("s4 != s5");
       if (s4 != s6) System.out.println("s4 != s6");
       if (s5 != s6) System.out.println("s5 != s6");

       if (s1 == "ABC가각간") System.out.println("s1 == ABC가각간");
       //==는 주소를 비교한다, 절대 해당변수가 그 문자열인지 비교할때 이렇게 쓰면 안됌
       //암시적이기 때문에 같음
       if (s4 != "ABC가각간") System.out.println("s4 != ABC가각간");
       //그럼 문자열어떻게 비교할까?
    }      
}
