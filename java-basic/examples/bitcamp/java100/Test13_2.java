package bitcamp.java100;
public class Test13_2{
    public static void main(String[] args) {
        //1. 배열 선언 (배열 메모리 준비)   
       int [] arr1; //이렇게 쓰는걸 추천
       int arr2[]; //보통 c언어 표기법

    //    arr1 = 100;
    //    arr2 = 100; 정수값 넣을 수 없다(임의의 주소값을 넣으려는 행위)


    //2. 배열 메모리를 준비한 후 주소를 넣는다

    arr1 = new int [3]; //4바이트 메모리 3개를 만들어라
    arr2 = new int [4];

    //3. 배열을 사용하기
    // 배열주소변수[] = 값; <-0부터 시작!
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;

    System.out.printf("%d,%d,%d\n", arr1[0], arr1[1], arr1[2]);
    
    arr2[0] = 100;
    arr2[1] = 200;
    arr2[2] = 300;
    arr2[3] = 400;
    
    System.out.printf("%d,%d,%d,%d\n", arr2[0], arr2[1], arr2[2], arr2[3]);
    }
}