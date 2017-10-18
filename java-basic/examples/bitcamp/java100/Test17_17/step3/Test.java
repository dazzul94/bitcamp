package bitcamp.java100.Test17_17.step3;
public class Test {
    static class Rect {
        int width;
        int height;
    }
    //인스턴스를 다루는 메서드
    // 3단계: 너비, 높이 데이터를 저장할 때 사용할 전용 데이터 타입을 만든다. 
    static float area(Rect r) {
        return(r.width * r.height) / 10000f;
    }
    
    static float pyeong(Rect r) {
        return(r.width * r.height) / 10000 / 3.3f;
    }
    public static void main(String[] args) {
        Rect rect = new Rect();
        
        rect.width = 390;
        rect.height = 420;
        
        System.out.println(area(rect));
        System.out.println(pyeong(rect));
    }      
}
