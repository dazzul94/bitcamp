package java100.app;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.control.BoardController;
import java100.app.control.Controller;
import java100.app.control.GenericController;
import java100.app.control.MemberController;
import java100.app.control.RoomController;
import java100.app.control.ScoreController;

public class App {

    static Scanner keyScan = new Scanner(System.in);
    
    static HashMap<String, Controller> controllerMap = new HashMap<>();

    public static void main(String[] args) {
        controllerMap.put("1", new ScoreController());
        controllerMap.put("2", new MemberController());
        controllerMap.put("3", new BoardController());
//        controllerMap.put("4", new GenericController<Room>());
        controllerMap.put("4", new RoomController());

        loop:
            while (true) {
                System.out.print("명령> ");
                String[] input = keyScan.nextLine().toLowerCase().split(" ");

                // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
                try {
                    switch (input[0]) {
                    case "menu": doMenu(); break;
                    case "help": doHelp(); break;
                    case "quit": doQuit(); break loop;
                    case "go" : doGo(input[1]); break;
                    default: doError();
                    }
                } catch (Exception e) {
                    System.out.println("명령 처리 중 오류 발생!");
                    e.printStackTrace();
                }

                System.out.println();
            }//while

    }

//해당번호의 컨트롤러를 꺼내서 
    //다형적 변수에 입각해서 3가지 형태 모두 저장할수 있다
    // 저장된 그 주소가 Score컨트롤러의 객체 주소가 들어있다면
    //GenericController의 execute가호출되는 것이 아니라
    //ScoreController의 오버라이딩된 execute가 호출된다.
    private static void doGo(String menuNo) {
        Controller controller = controllerMap.get(menuNo);
        //controllerMap.get("1") = new ScoreController();
        //controllerMap.get("2") = new MemberController();
        //controllerMap.get("3") = new BoardController();
        
        if(controller == null) {
            System.out.println("해당 번호의 메뉴가 없습니다");
            return;
        }
        controller.execute(); //모든 class에는 execute가 반드시 오버라이딩 되어있다
    }


    

    private static void doMenu() {
        System.out.println("1 성적관리\n" + "2 회원관리\n" + "3 게시판");

    }
    private static void doHelp() {

        System.out.println("[명령]\n" + 
                "menu    - 메뉴 목록을 출력한다.\n" + 
                "go 번호 - 메뉴로 이동한다.\n" + 
                "quit    - 프로그램을 종료한다.");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }





}









