package bitcamp.java100.Test17_17.step4;
public class Test {
    //인스턴스를 다루는 메서드
    // 4단계: Rect 클래스를 별도의 파일로 분리 
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
