package bitcamp.java100.ch09.ex3;

//class Box {
//    Object value; 
//    Box next;
//} 여기다가 넣으면 이건 패키지 멤버 클래스다!!!!!!!!!!!!!!!

public class LinkedList {
    private class Box { // 이 클래스 안에서만 쓰이니까 private으로 막는다
        Object value; 
        Box next;
    }
    
    Box head; //null이 기본적으로 우리가 필요한 유효한 값
    Box tail;

    int len;

    public void add(Object value) {
        Box box = new Box();

        box.value = value;

        if(tail == null) { //tail 이 null 이면 head도 null 이고 그건 첫번째 빈상자를 가리켜야 한다
            head = box;
            tail = box;
        } else {
            tail.next = box;
            tail = box;
        }
        this.len++;
    }
    public int size() {
        return len;
    }

    public Object get(int index) {
        if(index < 0 || index >= len) 
            return null;

        Box box = head; //i = 0으로 바꿔보자
        for(int count = 1; count <= index; count++) {
            box = box.next;
        }
        return box.value;

    }
    public void insert(int index, Object value) {
        if(index < 0 || index >= len) 
            return;
        Box box = new Box();
        box.value = value;
        
        len++;// 뒤에다 놓으면 index 0일때 len++안된다
        
        if (index == 0) {
            box.next = head;
            head = box;
            return;
        }
        
        Box pre = head;

        for(int count = 1; count < index; count++)
            pre = pre.next;
        box.next = pre.next;
        
        pre.next = box;
        
    }
    public Object remove(int index) {
        if(index < 0 || index >= len) 
            return null;
        len--;//어차피 삭제하니까 len은 미리 줄여버리자
        Box removedBox;
        if(index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value; 
        }
        
        Box pre = head;

        for(int count = 1; count < index; count++)
            pre = pre.next; //현재 헤드가 바로 지우려는 박스의 전박스다
        
        removedBox = pre.next;
        pre.next = pre.next.next;
        
        if (index == len -1) {
            tail = pre;
        }
        return removedBox.value;
        
    }
}
