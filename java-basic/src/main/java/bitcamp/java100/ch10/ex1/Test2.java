package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test2 {
    
    //Static nested class (바깥 클래스의 이름만으로 사용가능)
    static class A {}
    
    //Non static nested class (=inner class)
    class B {}
    
    Object obj = new Object() {
        String name;
        public void m1() {}
        };
    
    public static void main(String[] args) {
        
        //local class
        class C {}
        
        Object obj = new Object() {
            String name;
            public void m1() {}
            };
    }
}
