package Mycode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserController {static Scanner keyScan = new Scanner(System.in);

private ArrayList<User> list = new ArrayList<>();

public void execute() {
    loop:
        while(true) {
            System.out.print("학생관리> ");
            String input = keyScan.nextLine();

            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "add": this.doAdd(); break;
                        case "list": doList(); break;
                        case "view": doView(); break;
                        case "update": doUpdate(); break;
                        case "delete": doDelete(); break;
                        case "main": break loop;
            default: System.out.println("해당 명령이 없습니다");
            }
        }
}
private void doAdd() {
    System.out.println("[회원 등록]");

    User user;
    while (true) {
        user = new User(); 
        user.input(); 

        list.add(user);
//        if(student 의 이메일이 이미 등록되어있다면 이미 등록된 이메일입니다)

        System.out.println("입력하였습니다");
        break;
    }

}
private void doList() {
    System.out.println("[회원 목록]");
    
    Iterator<User> iterator = list.iterator();
    while (iterator.hasNext()) {
        iterator.next().print();
    }
}
private void doView() {
    System.out.println("[회원 정보]");
    String email = Prompts.input("이메일? ");
    
    User user = null;
    User viewedUser = new User();
    viewedUser.email = email;
    
    Iterator<User> iterator = list.iterator();
    while (iterator.hasNext()) {
        User temp = iterator.next();
        if (temp.email.equals(email)) {
            user = temp;
            break;
        }
    }
    
    if (user == null) {
        System.out.printf("'%s'의 회원 정보가 없습니다.\n", viewedUser.email);
    } else {
        user.print();
    }
}
private void doDelete() {
    System.out.println("[학생 삭제]");
    String email = Prompts.input("이메일? ");
    
    User user = null;
    User viewedUser = new User();
    viewedUser.email = email;
    
    Iterator<User> iterator = list.iterator();
    while (iterator.hasNext()) {
        User temp = iterator.next();
        if (temp.name.equals(email)) {
            user = temp;
            break;
        }
    }
    
    if (user == null) {
        System.out.printf("'%s'의 회원 정보가 없습니다.\n", viewedUser.email);
    } else {
        if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
            list.remove(user);
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("삭제를 취소하였습니다.");
        }
    }
}

private void doUpdate() {
    System.out.println("[학생 정보 변경]");
    String email = Prompts.input("이름? ");
    
    User user = null;
    User viewedUser = new User();
    viewedUser.email = email;
    
    Iterator<User> iterator = list.iterator();
    while (iterator.hasNext()) {
        User temp = iterator.next();
        if (temp.name.equals(email)) {
            user = temp;
            break;
        }
    }
    
    if (user == null) {
        System.out.printf("'%s'의 회원 정보가 없습니다.\n", viewedUser.email);
    } else {
        user.update();
    }
}





}
