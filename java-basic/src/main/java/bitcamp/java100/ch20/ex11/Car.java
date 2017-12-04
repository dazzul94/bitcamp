package bitcamp.java100.ch20.ex11;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Car {
    private String model;
    private String color;
    private int capacity;
    private Engine engine;
    private Map<String, String> options;
    
    public Car() {
        System.out.println("Car()");
    }

    
    @Override()
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine
                + ", options=" + options + "]";
    }


    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        System.out.println("setOptions()");
        this.options = options;
    }


    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        System.out.println("setModel()");
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
        System.out.println("setColor()");
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
        System.out.println("setCapacity");
    }
    public Engine getEngine() {
        return engine;
    }
    @Autowired(required=false) //Engine 없어도 객체 만들려고 할때
//    @Qualifier(value="e2")
    @Qualifier("e2")//value는 생략가능
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("setEngine()");
    }

}
