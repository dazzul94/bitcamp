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
package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8 {
    static class User {
        String name;
        String email;
        String number;
        String save;
        String contin;
    }
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1); //JVM을 종료한다
        }
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        
        ArrayList<User> list = new ArrayList<>();
        
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        user1.name = console.readLine("이름? ");
        user1.email = console.readLine("이메일? ");
        user1.number = console.readLine("핸드폰번호? ");
        user1.save = console.readLine("저장하시겠습니까? (y/n) ");
        if (user1.save.equals("y")) {
            System.out.println("저장하였습니다");
        } else if (user1.save.equals("n")) {
            System.out.println("저장 취소하였습니다");
            list.remove(user1);
        }
        user1.contin = console.readLine("계속 입력하시겠습니까? (y/n) ");
        if (user1.contin.equals("n"))//->break;
        {}
        
        for(User a : list) {
            System.out.println(a);
        }
    }
}      
