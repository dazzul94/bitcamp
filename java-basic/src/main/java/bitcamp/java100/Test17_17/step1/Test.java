package bitcamp.java100.Test17_17.step1;
public class Test {
    //인스턴스를 다루는 메서드
    //1단계: 메소드 분리전
    public static void main(String[] args) {
        int width = 390; //단위: cm
        int height = 420;
        
        float area = (width * height) / 10000f; //float 암시적 형변환
        System.out.println(area);

        float pyeong = area / 3.3f;
        System.out.println(pyeong);
    }      
}
