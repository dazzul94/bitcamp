package bitcamp.java100.ch06.ex6;

public class Test03 {

    public static void main(String[] args) throws Exception{

        Car03[] cars = new Car03[6];
        
        
        cars[0] = new Car03("티코", 900, Car03.TYPE_BUS, Car03.USE_COMPANY);
        cars[1] = new Car03("티코", 900, Car03.TYPE_SEDAN, Car03.USE_PRIVATE);
        cars[2] = new Car03("티코", 900, Car03.TYPE_TRUCK, Car03.USE_COMMERCIAL);

        cars[3] = new Car03("소나타", 1980, Car03.TYPE_BUS, Car03.USE_PRIVATE);
        cars[4] = new Car03("소나타", 1980, Car03.TYPE_SEDAN, Car03.USE_COMPANY);
        cars[5] = new Car03("소나타", 1980, Car03.TYPE_TRUCK, Car03.USE_COMMERCIAL);
        
        System.out.printf("총 생산량: %d대\n",Car03.count);

        for(int i = 0; i < cars.length; i++) {
        System.out.printf("%d, %s, %d\n",cars[i].no, cars[i].model, cars[i].cc);
        }
    }

}
