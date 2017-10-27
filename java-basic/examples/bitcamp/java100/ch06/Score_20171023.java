package bitcamp.java100.ch06;

public class Score_20171023 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    Score_20171023(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.sum = kor + eng + math;
        this.aver = this.sum / 3f;
    }
}
