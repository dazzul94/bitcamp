package bitcamp.java100;
public class Test18_2 {
    //String 클래스 -literal String 인스턴스
    public static void main(String[] args) {
       String s1;
       
       s1 = "ABC가각간"; //constants pool에 인스턴스가 생성된다
       String s2 = "ABC가각간";
       //s1과 s2에 저장된 레퍼런스의 값이 같다.
       //암시적으로 String 인스턴스를 만들때에는 string pool이라는 별도의 영역에 인스턴스가 생성된다.
       //중복 허용 X
       
       System.out.println(s1 == s2);
       
    }      
}
