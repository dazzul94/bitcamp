package bitcamp.java100;
//메서드
public class Test17_11 {
    static int m1(int p) {
        return m2(p + 1); //받은 p값에 1을 더해서 넘겨준다
    }
    static int m2(int q) {
        return m3(q + 1);
    }
    static int m3(int r) {
        return m4(r + 1);
    }
    static int m4(int s) {
        return s + 1;
    }
    public static void main(String[] args) {
        int result = m1(1);
        System.out.println(result);
    }      
}
