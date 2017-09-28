package bitcamp.java100;
public class Test13_3{
    public static void main(String[] args) {
        //배열의 길이?
        int [] arr1; //배열 레퍼런스 선언
        arr1 = new int [3]; // 배열 생성
        // arr1 = null; 주소 없음~
        //'length'
        System.out.println(arr1.length);

        arr1[0] = 100;
        arr1[1] = 90;
        arr1[2] = 80;
        // arr1[-1] = 200; 컴파일은 되는데 실행오류가 뜸!!!!!!!!
        // arr1[3] = 300; java.lang.ArrayIndexOutOfBoundsException 예외 발생

    }
}