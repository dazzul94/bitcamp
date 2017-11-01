package bitcamp.java100.ch09.ex6;

public class Stack {
    private class Box { 
        Object value; 
        Box pre;
        
        public Box() {} 
        
        
        public Box(Object value) { 
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
        
        Box box = top; 
        
        top = top.pre;
        
        len--;
        
        return box.value;
    }
}
