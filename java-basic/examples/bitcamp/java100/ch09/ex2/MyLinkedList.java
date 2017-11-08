package bitcamp.java100.ch09.ex2;

public class MyLinkedList {
    Box head;
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
        len++;
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

    public Box getBox(int index) {
        if(index < 0 || index >= len) 
            return null;

        Box box = head; //i = 0으로 바꿔보자
        for(int count = 1; count <= index; count++) {
            box = box.next;
        }
        return box;

    }
    public void insert(int index, Object value) {
            
        Box box = new Box();
        box.value = value;

        box.next = getBox(index);
        getBox(index-1).next = box;
        len++;
    }
    public void remove(int index) {
        
        getBox(index-1).next = getBox(index+1);
        len--;
    }

}
