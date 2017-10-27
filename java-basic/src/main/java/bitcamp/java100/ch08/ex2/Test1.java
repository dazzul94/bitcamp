//다형성(poly-morphism) - 다형적 변수(polymorphic variable)
package bitcamp.java100.ch08.ex2;

public class Test1 {
    public static void main(String[] args) {
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        b = new Boat();
//        b = new Vehicle();
//        b = new Car();
//        b = new Truck();
//        b = new Sedan();
        
        Car c;
        c = new Car();
        c = new Truck();
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
