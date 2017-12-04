package bitcamp.java100.ch20.ex6;

public class Seat {
    String type;
    boolean heat;
    boolean autoControl;
    
    public Seat() {
        System.out.println("Seat()");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("setType()");
        this.type = type;
    }

    public boolean isHeat() {
        return heat;
    }

    public void setHeat(boolean heat) {
        System.out.println("setHeat()");
        this.heat = heat;
    }

    public boolean isAutoControl() {
        return autoControl;
    }

    public void setAutoControl(boolean autoControl) {
        System.out.println("setAutoControl()");
        this.autoControl = autoControl;
    }

    @Override
    public String toString() {
        return "Seat [type=" + type + ", heat=" + heat + ", autoControl=" + autoControl + "]";
    }
    
    

}
