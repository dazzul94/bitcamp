package java100.app.control;
import java.util.Iterator;

import java100.app.domain.Score;
import java100.app.util.Prompts;

public class ScoreController extends GenericController<Score> {

    private Score findByName(String name) {
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (score.getName().equals(name)) {
                return score;
            }
        }
        return null;
    }
    @Override
    public void execute() {
        loop:
            while(true) {
                System.out.print("성적관리> ");
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

    private void doDelete() {
        System.out.println("[성적 삭제]");
        String name = Prompts.inputString("이름? ");
        Score score = findByName(name);

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    private void doUpdate() {
        System.out.println("[학생 성적 변경]");
        String name = Prompts.inputString("이름? ");

        Score score = findByName(name);

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            int kor = score.getKor(); //임시 국어
            try { //사용자로부터 입력받은 값이 정상적이면 oK
                kor = Prompts.inputInt("국어(%d)", score.getKor()); //현재 값 저장하고
            } catch(Exception e) {} //에러가 뜨면 원래 값을 쓰겠다

            int eng = score.getEng();
            try {
                eng = Prompts.inputInt("영어(%d)", score.getEng());
            } catch(Exception e) {}

            int math = score.getMath();
            try {
                math = Prompts.inputInt("수학? ", score.getMath());
            } catch (Exception e){}
            
            if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
                score.setKor(kor);
                score.setEng(eng);
                score.setMath(math);
                System.out.println("변경하였습니다.");
            } else {
                System.out.println("변경을 취소하였습니다");
            }
            //엔터치면 기본값 만들기
        }
    }

    private void doView() {
        System.out.println("[성적 상세 정보]");
        String name = Prompts.inputString("이름? ");

        Score score = findByName(name);

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return; //걍 리턴해버린다 두개일때!
        } 
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                score.getName(), 
                score.getKor(),
                score.getEng(),
                score.getMath(),
                score.getSum(), 
                score.getAver());

    }

    private void doList() {
        System.out.println("[성적 목록]");

        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            System.out.printf("%-4s, %4d, %6.1f\n",  
                    score.getName(), score.getSum(), score.getAver());
        }
    }

    private void doAdd() {
        System.out.println("[성적 등록]");

        Score score = new Score();

        score.setName(Prompts.inputString("이름? "));
        score.setKor(Prompts.inputInt("국어? "));
        score.setEng(Prompts.inputInt("영어? "));
        score.setMath(Prompts.inputInt("수학? "));

        list.add(score);

    }

}
