package bitcamp.java100.ch12.ex2;

import java.util.Iterator;

public class Array {
    
    private Object[] arr = new Object[10000];
    
    private int cursor = 0;
    
    public void add(Object obj) {
        if(cursor == arr.length) 
            return;
        arr[cursor++] = obj;
    }
    
    public int size() {
        return cursor;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= cursor) 
            return null;
        return arr[index];
    }
    
    public Object remove(int index) {
        if (index < 0 || index >= cursor) 
            return null;
        Object removedValue = arr[index];
        for(int i = index; i < cursor-1; i++) {
            arr[i] = arr[i+1];
        }
        cursor--;
        return removedValue;
    }
    
    public void inset(int index, Object value) {
        if(cursor == arr.length)
            return;
        
        if (index < 0 || index >= cursor) 
            return;
        for(int i = cursor-1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        cursor++;
    }
    public Iterator iterator() {
        return new MyIterator();
        
    } //호출되는 클래스를 만드는 입장
    class MyIterator implements Iterator<Object> {
        int index;
        
        @Override
        public boolean hasNext() {
            if (index < cursor) //커서는 항상 빈곳을 가리키니까 index는 cursor보다 작아야한다
                return true;
            return false;
        }

        @Override
        public Object next() {
            return arr[index++];
        }
        
    }
}
