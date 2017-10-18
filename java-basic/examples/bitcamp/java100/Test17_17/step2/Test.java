package bitcamp.java100.Test17_17.step2;
public class Test {
    //인스턴스를 다루는 메서드
    // 2단계: 메소드 분리 후
    static float area(int width, int height) {
        return(width * height) / 10000f;
    }
    
    static float pyeong(int width, int height) {
        return(width * height) / 10000 / 3.3f;
    }
    public static void main(String[] args) {
        int width = 390; //단위: cm
        int height = 420;
        
        System.out.println(area(width, height));

        System.out.println(pyeong(width, height));
    }      
}
