package bitcamp.java100;
public class Test18_7 {
    //StringBuffer 
    public static void main(String[] args) {
        //Immutable 객체 : 한번 값이 설정되면 메모리의 값을 바꿀 수 없는 객체
        String s1 = "Hello!";
        String s2 = s1.replace("l", "x");
        System.out.println(s1);
        System.out.println(s2);
        
        //Mutable 객체: 메모리의 값을 변경하고 싶을때 
        StringBuffer sb1 = new StringBuffer("Hello!");
        
        //append
        sb1.append("World!");
        System.out.println(sb1);
        
        //replace
        sb1.replace(2, 4, "xx");
        System.out.println(sb1);
        
        
    }      
}
