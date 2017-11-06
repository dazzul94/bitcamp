package Mycode;
import java.util.Scanner;

public class User {
    protected String name;
    protected String email; 
    protected int pwd;

    public User() {}
    
    public User(String name, String email, int pwd) {
        this.name = name;
        this.email = email;
        this.pwd = pwd;
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("이름? ");
        this.name = keyScan.nextLine();

        System.out.print("이메일? ");
        this.email = keyScan.nextLine();

        System.out.print("암호? ");
        this.pwd = keyScan.nextInt();

    }
    public void print() {
        System.out.printf("%-4s, %4s, %4d\n",  
                this.name, 
                this.email, 
                this.pwd);
    }

    public void update() {
        Scanner keyScan = new Scanner(System.in);

        System.out.printf("이름? (%s) ", this.name);
        
        String name = this.name; //현재 값 저장하고
        try { //사용자로부터 입력받은 값이 정상적이면 oK
            name = keyScan.nextLine(); 
        } catch(Exception e) {} //에러가 뜨면 원래 값을 쓰겠다

        System.out.printf("이메일? (%s) ", this.email);
        
        String email = this.email;
        try {
            email = keyScan.nextLine();
        } catch(Exception e) {}

        System.out.printf("암호? (%d) ", this.pwd);
        int pwd = this.pwd;
        try {
            pwd = Integer.parseInt(keyScan.nextLine());
        } catch (Exception e){}
        
        if (confirm2("변경하시겠습니까?(y/N) ")) {
            this.name = name;
            this.email = email;
            this.pwd = pwd;
            System.out.println("변경하였습니다.");
        } else {
            System.out.println("변경을 취소하였습니다");
        }
        //엔터치면 기본값 만들기
        
        
        
        
    }
    static boolean confirm2(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();

        if (response.equals("n") || response.equals("no") || 
                response.equals("")) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
