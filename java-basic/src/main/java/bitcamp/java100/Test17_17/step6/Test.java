package bitcamp.java100.Test17_17.step6;
public class Test {
    //인스턴스를 다루는 메서드
  //6단계: 인스턴스의 값을 다루는 메서드는 해당 인스턴스의 전용 메서드로 만든다.
    public static void main(String[] args) {
        Rect r = new Rect();
        
        r.width = 390;
        r.height = 420;
        
        //인스턴스 전용 메서드를 호출할때
        System.out.println(r.area());
        System.out.println(r.pyeong());
    }      
}
