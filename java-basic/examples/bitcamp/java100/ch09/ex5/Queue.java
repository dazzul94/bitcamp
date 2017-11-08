package bitcamp.java100.ch09.ex5;

public class Queue {
    private class Box { 
        Object value; 
        Box next;
        
        public Box() {} //빈상자 만드는 생성자
        //생성자로 우리가 최소한 필요한 유효한 값을 만든다 우리는 값을 넣을 수 있는 빈 박스가 필요하다고 설계했다 
        
        public Box(Object value) { //값을 주고 객체를 생성할 생성자
            this.value = value;
        }
    }        
    Box head;
    Box tail;

    int len;

    public void add(Object value) {
        Box box = new Box(value);
        if(tail != null) //!(tail의 인스턴스가 없다)
        tail.next = box;
        
        tail = box;
        
        
        len++;
        
        if(head == null) //(head의 인스턴스가 없다)
            head = box;
    }

    public int size() {
        return len;
    }

    public Object poll() {
        if(len == 0) 
            return null;
        
        Box box = head; //임시저장
        
        head = head.next;
        
        len--;
        
        return box.value;
    }
}
