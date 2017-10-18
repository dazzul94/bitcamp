package bitcamp.java100;
public class Test18_1 {
    //String 클래스 
    public static void main(String[] args) {
       String s1;
       s1 = new String("ABC가각간"); //Heap 메모리에 인스턴스가 생성된다
       String s2 = new String("ABC가각간");
       //s1와 s2의 레퍼런스에 저장된 주소는 다르다
       System.out.println(s1 == s2);
       

    }      
}
