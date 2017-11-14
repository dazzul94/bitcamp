package bitcamp.java100.ch14.ex4;

import java.io.Serializable;

public class Score2 implements Serializable{
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;
    
    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }

    public Score2() {}
    
    public Score2(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng  = eng;
        this.math = math;
        
        this.compute();
    }
    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3.f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }
    
}
