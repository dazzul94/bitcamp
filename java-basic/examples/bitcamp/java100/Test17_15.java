package bitcamp.java100;
public class Test17_15 {
    //로컬 변수의 생명주기
    static int m1() {
        int a =100;
        int b = 200;
        int c = a + b;
        return c; //로컬 변수의 c의 값을 리턴한다.
    }
    //메소드에서 만든 배열의 생명주기
    static int[] m2() {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        return arr;
        
    }
    public static void main(String[] args) {
        int r1 = m1();
        //m1()에서 만든 로컬 변수는 접근할 수 없다
        //c의 값은 리턴 받았기 때문에 r1 변수에 사용할 수 있다(값을 사용할 수 있는것)
        System.out.println(r1);
        
        System.out.println("--------------------------------------------");
        int[] r2 = m2();
        for (int i : r2)
            System.out.println(i);
    }      
}
