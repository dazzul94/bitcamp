package bitcamp.java100.ch12.ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Caller1 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        Iterator<String> iterator = list.iterator();
        //호출하는 쪽을 코딩, 호출하는 클래스를 작성, 호출하는 입장
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
