package bitcamp.java100;

public class Test15_11_2{
    public static void main(String[] args) {
    //비트연산자(& ,| ,~ , ^) 응용2 (배열사용)
        boolean[] arr = new boolean[10];
        arr[0] = false;
        arr[1] =  true;
        arr[2] = true;
        arr[3] = true;
        arr[4] = true;
        arr[5] = false;
        arr[6] = true;
        arr[7] = true;
        arr[8] = false;
        arr[9] = true;
        
    //사용권한 검사
        System.out.print(arr[0] ? "d" :"-");
        System.out.print(arr[1] ? "r" :"-");
        System.out.print(arr[2] ? "w" :"-");
        System.out.print(arr[3] ? "x" :"-");
        System.out.print(arr[4] ? "r" :"-");
        System.out.print(arr[5] ? "w" :"-");
        System.out.print(arr[6] ? "x" :"-");
        System.out.print(arr[7] ? "r" :"-");
        System.out.print(arr[8] ? "w" :"-");
        System.out.print(arr[9] ? "x" :"-");
        System.out.println();
        //장점: 메모리 절약(배열의 boolean은 각1바이트)
        //단점: arr[i]가 의미하는 바를 명확히 알수없다(가독성이 떨어진다)
    }
}