package bitcamp.java100.ch11.ex4;

public class Test1 {
    public static void main(String[] args) {
        HybridCar car = new HybridCar();
        car.model = "그냥 차!";
        car.cc = 300;
        
        car.run();
        car.stop();
        
    }

}
