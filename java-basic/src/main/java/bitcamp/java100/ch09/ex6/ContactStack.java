package bitcamp.java100.ch09.ex6;

public class ContactStack {
    private class Box { 
        Contact value; 
        Box pre;
        
        public Box() {} 
        
        
        public Box(Contact value) { 
            this.value = value;
        }
    }        
    Box top;

    int len;

    public void push(Contact value) {
        Box box = new Box(value);

        box.pre = top;
        
        top = box;

        len++;
    }

    public int size() {
        return len;
    }

    public Contact pop() {
        if(len == 0) 
            return null;
        
        Box box = top; 
        
        top = top.pre;
        
        len--;
        
        return box.value;
    }
}
