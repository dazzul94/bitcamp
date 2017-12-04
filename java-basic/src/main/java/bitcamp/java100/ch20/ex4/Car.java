package bitcamp.java100.ch20.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {
    private String model;
    private String color;
    private int capacity;
    private Engine engine;
    private Tire[] tires;
    private List<Seat> seats;
    private Set<CD> jukebox;
    private Map<String, String> options;
    
    public Car() {
        System.out.println("Car()");
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine + ", tires="
                + Arrays.toString(tires) + ", seats=" + seats + ", jukebox=" + jukebox + ", options=" + options + "]";
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        System.out.println("setOptions()");
        this.options = options;
    }


    public Set<CD> getJukebox() {
        return jukebox;
    }

    public void setJukebox(Set<CD> jukebox) {
        System.out.println("setJukebox()");
        this.jukebox = jukebox;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        System.out.println("setSeats()");
        this.seats = seats;
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
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("setEngine()");
    }


    public Tire[] getTires() {
        return tires;
    }


    public void setTires(Tire[] tires) {
        this.tires = tires;
        System.out.println("setTire()");
    }
    
    
}
