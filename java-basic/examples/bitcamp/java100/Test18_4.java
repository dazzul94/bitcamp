package bitcamp.java100;
public class Test18_4 {
    //String 인스턴스 내용비교(equal :
    public static void main(String[] args) {
       String s1 = "ABC가각간"; 
       
       String s2 = new String("ABC가각간");
       //레퍼런스의 주소 비교
       if (s1 != s2) System.out.println("s1 != s2");
       //내용물이 같은지 비교
       //String클래스의 인스턴스 메서드인 eqauls()를 사용한다.
       if (s1.equals(s2)) System.out.println("s1과 s2의 내용물이 같다.");
    }      
}
