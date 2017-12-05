package bitcamp.java100.ch20.ex13;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Spring ioc에 객체를 생성해달라고 요청
public class Car {
    private String model;
    private String color;
    private int capacity;
    
    @Autowired //Engine 객체는 한개만 만들것이기 때문에 
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

}
