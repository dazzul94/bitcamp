package bitcamp.java100.ch07.ex4;

public class Test2 /*extends object*/ {
    
    
    
    public static void main(String[] args) {
        
        Test2 obj = new Test2();
        
        System.out.println(obj.toString());
        
        System.out.println(Integer.toHexString(obj.hashCode()));

        
        
        Test2 obj2 = new Test2();
        Test2 obj3 = obj2;
        
        System.out.println(obj.equals(obj2));
        System.out.println(obj2.equals(obj3));
        
        System.out.println("------------------------------------------");
        
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);   //주소가 같은지 물어봄
        System.out.println(s1.equals(s2)); //내용이 같은지 물어봄
        
        System.out.println("------------------------------------------");
        
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2); //주소 같은지 물어봄
        System.out.println(sb1.equals(sb2)); //주소 같은지 물어봄(String Buffer에서는 equals 재정의하지 않았다
        
        System.out.println("------------------------------------------");
        
        Class c = obj.getClass();
        System.out.println(c.getName());
                
                
    }

}
