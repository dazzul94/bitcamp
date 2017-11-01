package bitcamp.java100.ch09.ex6;

public class BookStack { //Book 타입의 value
    private class Box { 
        Book value; 
        Box pre;
        
        public Box() {} 
        
        
        public Box(Book value) { 
            this.value = value;
        }
    }        
    Box top;

    int len;

    public void push(Book value) {
        Box box = new Box(value);

        box.pre = top;
        
        top = box;

        len++;
    }

    public int size() {
        return len;
    }

    public Book pop() {
        if(len == 0) 
            return null;
        
        Box box = top; 
        
        top = top.pre;
        
        len--;
        
        return box.value;
    }
}
