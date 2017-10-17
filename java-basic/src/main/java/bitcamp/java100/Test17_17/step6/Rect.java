package bitcamp.java100.Test17_17.step6;

public class Rect {
    int width;
    int height;
    
    // 1) static 키워드를 제거한다 
    // =>static 이 없으면 인스턴스를 다루는 전용 메소드이다
    // 2) 파라미터 대신 this 
    
    float area() {
        return(this.width * this.height) / 10000f;
    }
    
    float pyeong() {
        return(this.width * this.height) / 10000 / 3.3f;
    }
}      
