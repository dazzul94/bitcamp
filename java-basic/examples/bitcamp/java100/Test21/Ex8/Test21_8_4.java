// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 
package bitcamp.java100.Test21.Ex8;

import java.io.Console;
import java.util.ArrayList;
//4단계
public class Test21_8_4 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
            String[] names = new String[100];
            String[] emails = new String[100];
            String[] tels = new String[100];
            
            //값이 저장될 위치
            int cursor = 0;
             
            //입력
            while (cursor < names.length) {
                String name = console.readLine("이름? ");
                String email = console.readLine("이메일? ");
                String tel = console.readLine("전화? ");
                String response = console.readLine("저장하시겠습니까? (y/n) ");
                
            if (response.toLowerCase().equals("y") ||
                    response.toLowerCase().equals("yes")) { 
                names[cursor] =  name;
                emails[cursor] = email;
                tels[cursor] = tel;
                cursor++;//나갔을때 커서는 마지막에 입력된 방번호 그 다음방을 가리킴 
            }
            
            response = console.readLine("계속 입력하시겠습니까? (y/n) ");
            if (!(response.toLowerCase().equals("y") ||
                    response.toLowerCase().equals("yes"))) 
                break;
            } 
            
            //출력
            for (int i = 0; i < cursor; i++) {
                System.out.printf("%s, %s, %s\n",names[i], emails[i], tels[i]);
            }
    }
}
