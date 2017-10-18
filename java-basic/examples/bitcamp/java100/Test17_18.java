package bitcamp.java100;
public class Test17_18 {
    //클래스 메서드(암기)
    static class My {
        int value;
        static void print(My ref) {
            System.out.println(ref.value);    
        }
    }
    
    public static void main(String[] args) {
        My r = new My();
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;

        My.print(r1);
        My.print(r2);
        My.print(r3);
        
        r1.print(r1); //앞의 r1은 버려진다
        
        
    }

}      
