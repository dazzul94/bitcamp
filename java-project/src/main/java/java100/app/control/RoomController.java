package java100.app.control;
import java.util.Iterator;

import java100.app.domain.Member;
import java100.app.domain.Room;
import java100.app.util.Prompts;

public class RoomController extends GenericController<Room> {
    //Member를 다루는 수퍼클래스를 상속
    private Room find(String name) {
        Iterator<Room> iterator = list.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;// 반복문을 다 돌아도 못찾았으면 null을 리턴한다
    }
    @Override
    public void execute() {
        loop:
            while (true) {
                System.out.print("강의실관리> ");
                String input = keyScan.nextLine();

                // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
                switch (input) {
                case "list": this.doList(); break;
                case "add": this.doAdd(); break;
                case "delete": this.doDelete(); break;
                case "main": break loop;
                default: 
                    System.out.println("해당 명령이 없습니다.");
                }
            }
    }

    private void doList() {
        System.out.println("[강의실 목록]");

        Iterator<Room> iterator = list.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.printf("%s, %s, %d\n",  
                    room.getLocation(), 
                    room.getName(),
                    room.getCapacity());
        }
    }

    private void doAdd() {
        System.out.println("[강의실 등록]");

        Room room = new Room(); 

        room.setName(Prompts.inputString("강의실 이름? "));

        if (find(room.getName()) != null) {
            System.out.println("이미 등록된 강의실입니다.");
            return;
        } //이메일 먼저 받고 이메일이 중복됐나 확인 먼저하고
        // 그게 아니라면 이름과 암호를 입력받고
        //마지막에 list에 add한다
        room.setLocation(Prompts.inputString("지역? "));
        room.setCapacity(Prompts.inputInt("수용인원? "));

        list.add(room);

    } 

    private void doDelete() {
        System.out.println("[강의실 삭제]");
        String name = Prompts.inputString("강의실 이름? ");

        Room room = find(name);

        if (name == null) {
            System.out.printf("'%s'강의실 정보가 없습니다.\n", name);
            return;
        }
        
        if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
            list.remove(room);
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("삭제를 취소하였습니다.");
        }
    }

}
