package java100.app.control;
import java.sql.Date;
import java.util.Iterator;

import java100.app.domain.Board;
import java100.app.util.Prompts;

public class BoardController extends GenericController<Board> {


    private Board findByNum(int num) {
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (board.getNum() == num) 
                return board;
        }
        return null;

    }

    @Override
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
            Board board = iterator.next();
            System.out.printf("%d, %s, %s, %d\n", 
                    board.getNum(), 
                    board.getTitle(),
                    board.getRegDate().toString(),
                    board.getViewCount());
        }
    }

    private void doAdd() {
        System.out.println("[게시물 등록]");

        Board board = new Board(); 
        board.setNum(Prompts.inputInt("번호? "));
        if (findByNum(board.getNum()) != null) {
            System.out.println("이미 등록된 번호입니다.");
            return;  
        }
        board.setTitle(Prompts.inputString("제목? "));
        board.setContent(Prompts.inputString("내용? "));
        board.setRegDate(new Date(System.currentTimeMillis()));

        list.add(board);

    } 

    private void doView() {
        System.out.println("[게시물 상세 정보]");
        int num = Prompts.inputInt("번호? ");

        Board board = findByNum(num);

        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", num);
            return;
        } 
        System.out.printf("제목: %s\n", board.getTitle());
        System.out.printf("내용: %s\n", board.getContent());
        System.out.printf("등록일: %s\n", board.getRegDate().toString());
        board.setViewCount(board.getViewCount() + 1);
        System.out.printf("조회수: %d\n", board.getViewCount());
    } 

    private void doDelete() {
        System.out.println("[게시물 삭제]");
        int num = Prompts.inputInt("번호? ");

        Board board = findByNum(num);

        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", num);
            return;
        }
        if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
            list.remove(board);
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("삭제를 취소하였습니다.");
    }
}

private void doUpdate() {
    System.out.println("[게시물 변경]");
    int num = Prompts.inputInt("번호? ");

    Board board = findByNum(num);

    if (board == null) {
        System.out.printf("%d번 게시물이 없습니다.\n", num);
        return;
    } 

    String title = Prompts.inputString("제목?(%s)", board.getTitle());
    if (title.isEmpty()) {
        title = board.getTitle();
    }

    String content = Prompts.inputString("내용? ");

    if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
        board.setTitle(title);
        board.setContent(content);
        board.setRegDate(new Date(System.currentTimeMillis()));

        System.out.println("변경하였습니다.");

    } else {
        System.out.println("변경을 취소하였습니다.");
    }
}
}
