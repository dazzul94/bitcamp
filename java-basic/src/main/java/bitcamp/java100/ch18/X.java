package bitcamp.java100.ch18;

public class X {
    
    String name;
    int age;
    
    
    @Override
    public String toString() {
        return "X [name=" + name + ", age=" + age + "]";
    }
    
    
    public X() {
        System.out.println("X()호출됨");
    }
    public X(int p1) {
        System.out.println("x(int) 호출됨");
        this.age = p1;
    }
   public X(String p1) {
       System.out.println("X(String) 호출됨");
       this.name = p1;
   }
   public X(String p1,int p2) {
       System.out.println("x(String, int)호출됨");
       this.name = p1;
       this.age = p2;
   }
   
   
   public void m() {
       System.out.println("m() 호출됌");
   }
   public void m(int a) {
       System.out.println("m(int) 호출됌");
   }
   public void m(int a, String b) {
       System.out.println("m(int, String) 호출됌");
   }
   
   public static void m2() {
       System.out.println("X.m2 호출됌");
   }
   public static void m2(int a) {
       System.out.println("X.m2(int) 호출됌");
   }
}