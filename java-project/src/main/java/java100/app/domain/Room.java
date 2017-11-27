package java100.app.domain;

public class Room {
    protected int no;
    protected String name;
    protected String location;
    protected int capacity;
    
    public Room() {}
    
    public Room(int no, String name, String location,  int capacity) {
        this.no = no;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }
    

    @Override
    public String toString() {
        return "Room [no=" + no + ", location=" + location + ", name=" + name + ", capacity=" + capacity + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
