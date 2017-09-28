package bitcamp.java100;
public class Test12_3 {
    public static void main(String[] args) {    
        int i, j ; //콤마를 이용해서 int 메모리 2개 만들기 
        i = 100 ;
        j = 200 ;

        int k = 100; // 변수를 선언할때 초기 값 바로 저장
        
        int x = 100, y, z= 300; //콤마를 이용해서 변수를 여러개 선언하면서 동시에 초기화 할 수 있다

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(x);
        System.out.println(z);
        
        // System.out.println(y); //컴파일 오류!!!!!!!!!!!!!!!!!!
        //변수를 준비한 후 단 한번이라도 값을 저장하지 않고 사용할 수 없다.
        }
}