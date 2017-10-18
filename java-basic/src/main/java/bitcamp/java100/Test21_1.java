package bitcamp.java100;

import java.util.Scanner;

//Scanner 사용법
public class Test21_1 {
    
    public static void main(String[] args) {

        //1) 준비: Scanner 객체를 생성한다.
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("입력하세요: ");
        //2) 스캐너 객체를 이용하여 키보드로부터 들어온 데이터를 읽는다.
        //nextLine() : 입력된 내용을 한 줄씩 잘라서 리턴한다.(엔터칠 때까지 기다린다)-blocking I/O
        String line = keyScan.nextLine();
        
        System.out.println(line);
        //3) 사용완료 후 그 객체가 사용한 자원을 해제시킨다.
        keyScan.close();
    }      
}
