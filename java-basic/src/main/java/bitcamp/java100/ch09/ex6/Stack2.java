package bitcamp.java100.ch09.ex6;

public class Stack2<T> {
    private class Box { 
        T value; 
        Box pre;
        
        public Box() {} 
        
        
        public Box(T value) { 
            this.value = value;
        }
    }        
    Box top;

    int len;

    public void push(T value) {
        Box box = new Box(value);

        box.pre = top;
        
        top = box;

        len++;
    }

    public int size() {
        return len;
    }

    public T pop() {
        if(len == 0) 
            return null;
        
        Box box = top; 
        
        top = top.pre;
        
        len--;
        
        return box.value;
    }
}
