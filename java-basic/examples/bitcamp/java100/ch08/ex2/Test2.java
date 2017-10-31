//다형성(poly-morphism) - 다형적 변수(polymorphic variable)
package bitcamp.java100.ch08.ex2;

public class Test2 {
    public static void main(String[] args) {

        Car c;
        
        c = new Car();
        
        c.model = "티코";
        c.capacity = 4;
        c.engineType = 1;
        c.cylinder =4;
        c.valve = 16;
        
//        c.auto = true;
        
        c = new Truck();
        c.model = "타이탄";
        c.capacity = 3;
        c.engineType = 2;
        c.cylinder = 8;
        c.valve = 32;
        
//        c.weight = 15;
//        c.dump = true;
        
        
        c = new Sedan();
        
//        c = new Boat();
//        c = new Vehicle();
        
        Sedan s;
//        s = new Truck;
//        s = new Vehicle();
//        s = new Car();
//        s = new Boat();
        
        
        
    }

}
