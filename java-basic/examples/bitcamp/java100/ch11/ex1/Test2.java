package bitcamp.java100.ch11.ex1;
//Specialization!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Test2 { //좀 더 특별한 차 Truck!
    public static void main(String[] args) {
        Truck c = new Truck();
        c.model = "티코";
        c.cc = 900;
        c.weight = 3.8f;
        
        c.run();
        c.stop();
        c.dump();
        
        
    }

}
