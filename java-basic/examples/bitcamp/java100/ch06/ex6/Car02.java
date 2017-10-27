package bitcamp.java100.ch06.ex6;

public class Car02 {

    static int count;
    
    long no;
    String model;
    int cc;
    int type; //(트럭 = 1, 승용 = 2, 승합 = 3)
    int use;  //(개인 = 1, 법인 = 2, 영업 = 3)
    

    Car02(String model, int cc, int type, int use) {          //생성자다
        count++;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.use = use;
        
        this.no = System.currentTimeMillis();

        try {
            Thread.currentThread().sleep(50); //50 밀리세컨드
        } catch (Exception e) {}
    }
}
