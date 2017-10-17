package bitcamp.java100.Test17_17.step6;
public class Test {
    //인스턴스를 다루는 메서드
    // 5단계: 넓이를 구하는 메서드를 별도의 클래스로 분류한다.
    
    public static void main(String[] args) {
        Rect rect = new Rect();
        
        rect.width = 390;
        rect.height = 420;
        
        System.out.println(Rect.area(rect));
        System.out.println(Rect.pyeong(rect));
    }      
}
