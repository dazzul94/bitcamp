package bitcamp.java100;
public class Test13_4{
    public static void main(String[] args) {
       //배열 초기화!!!!!

       //1. 배열 레퍼런스 선언과 동시에 배열 생성
       int [] arr1 = new int [3];
       
       //2. 배열 생성과 동시에 값 초기화
       int [] arr2 = new int [] {100, 90, 80}; //new int 뒤에 []에는 숫자 X!
       //컴파일러가 자동으로 개수를 세서 만들어준다.

      //3. 레퍼런스 선언 후 배열 나열
       int [] arr3 ;
       arr3 = new int [] {90,80,70};

       //4. new int [] 사용안해도됌
       int [] arr4 = {100,200,300};
       //선언과 동시에 값을 초기화 할때만!!!!!!
 //이거 안됌~~
    //    int [] arr5 ;
    //    arr5 = {100,200,300};
    }
}