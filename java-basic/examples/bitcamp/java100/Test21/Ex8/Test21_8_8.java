package bitcamp.java100.Test21.Ex8;

import java.io.Console;
//8단계: 예외 처리 문법을 도입하여 add()와 get() main()에 적용한다
//       배열의 크기를 벗어나거나 유효하지 않은 인덱스의 값을 꺼내려 할 때 예외를 발생시킨다.
public class Test21_8_8 {
    static Console console;
    
    static Contact[] contacts = new Contact[100];
    
    static int cursor = 0;
    
    static class Contact {
        String name;
        String email;
        String tel;
    }
    static void printContacts() {
        for (int i = 0; i < size(); i++) {
            Contact contact = get(i);
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
    static void add(Contact contact) {
        if(cursor >= contacts.length)
            throw new RuntimeException("최대 저장 개수 초과");
        
        contacts[cursor] = contact;
        cursor++;
    }
    static Contact get(int index) {
        if (index < 0 || index >= cursor)
            throw new RuntimeException("유효하지 않은 인덱스!");
        
            return contacts[index];
    }
    static int size() {
        return cursor;
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
                add(contact);
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







