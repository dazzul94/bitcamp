package bitcamp.java100.ch09.ex4;

public class Stack {
    private class Box { 
        Object value; 
        Box pre;
        
        public Box() {} //빈상자 만드는 생성자
        //생성자로 우리가 최소한 필요한 유효한 값을 만든다 우리는 값을 넣을 수 있는 빈 박스가 필요하다고 설계했다 
        
        public Box(Object value) { //값을 주고 객체를 생성할 생성자
            this.value = value;
        }
    }        
    Box top;

    int len;

    public void push(Object value) {
        Box box = new Box(value);

        box.pre = top;
        
        top = box;

        len++;
    }

    public int size() {
        return len;
    }

    public Object pop() {
        if(len == 0) 
            return null;
        
        Box box = top; //임시저장
        
        top = top.pre;
        
        len--;
        
        return box.value;
    }
}
