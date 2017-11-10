package bitcamp.java100.ch14.ex1;


public class Test8_2 {

    static int f(int n) {
        if (n == 0) 
            return 0;
        int sum = 0;
        for(int i = n; i > 0; i--) {
        sum += i;
        }
        return sum;


    }

    public static void main(String[] args) throws Exception {
        System.out.println(f(5));
    }
}
