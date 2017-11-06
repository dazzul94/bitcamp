import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController {

    static Scanner keyScan = new Scanner(System.in);
    private ArrayList<Board> list = new ArrayList<>();

    private Board findByNum(int num) {
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (board.num == num) 
                return board;
        }
        return null;

    }


    public void execute() {
        loop:
            while(true) {
                System.out.print("게시판> ");
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
                System.out.println();
            }
    }

    private void doList() {
        System.out.println("[게시물 목록]");

        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    private void doAdd() {
        System.out.println("[게시물 등록]");

        Board board = new Board(); 
        board.input();

        if (findByNum(board.getNum()) != null) {
            System.out.println("이미 등록된 게시물입니다.");
        } else {
            list.add(board);
        }

    } 

    private void doView() {
        System.out.println("[게시물 상세 정보]");
        int num = Integer.parseInt(Prompts.input("번호? "));

        Board board = findByNum(num);

        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", num);
        } else {
            board.printDetail();
        }
    } 

    private void doDelete() {
        System.out.println("[게시물 삭제]");
        int num = Integer.parseInt(Prompts.input("번호? "));

        Board board = findByNum(num);

        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", num);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(board);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    private void doUpdate() {
        System.out.println("[게시물 변경]");
        int num = Integer.parseInt(Prompts.input("번호? "));

        Board board = findByNum(num);

        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", num);
        } else {
            board.update();
        }
    }






}
