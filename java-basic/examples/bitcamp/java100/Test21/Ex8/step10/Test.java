package bitcamp.java100.Test21.Ex8.step10;

import java.io.Console;
//10단계: Contact 배열을 다루는 메서드를 별도의 클래스로 분류한다
public class Test {
    static Console console;
    
    static void printContacts() {
        for (int i = 0; i < ContactArray.size(); i++) {
            Contact contact = ContactArray.get(i);
            System.out.printf("%s, %s, %s\n", 
                    contact.name, 
                    contact.email, 
                    contact.tel);
        }
    }
    static boolean confirm(String message) {
        String input = console.readLine(message + "(y/n) ");
        if (input.toLowerCase().equals("y") || 
              input.toLowerCase().equals("yes"))
            return true;
        return false;
    }
    static Contact inputContact() {
        Contact contact = new Contact();

        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");
        
        return contact;
    }
    
    public static void main(String[] args) {
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }

        while (true) {

            Contact contact = inputContact();

            if (confirm("저장하시겠습니까?")) {
                try {
                    ContactArray.add(contact);
                } catch (RuntimeException e) {
                    System.err.println("최대 저장 개수를 초과하였습니다!");
                    break;
                }
            }

            if (!confirm("계속 입력하시겠습니까?"))
                break;
        }
        printContacts();
    }
}







