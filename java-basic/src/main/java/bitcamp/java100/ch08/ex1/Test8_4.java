package bitcamp.java100.ch08.ex1;

class Score4 {
    String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }
    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    public int getSum() {
        return this.sum;
    }
    public float getAver() {
        return this.aver;
    }
}

public class Test8_4 {
    public static void main(String[] args) {
        Score4 s = new Score4();

        s.name = "홍길동";
        s.setKor(100);
        s.setEng(100);
        s.setMath(100);

//        s.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n", s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        s.setKor(70);
    
        System.out.printf("%s, %d, %d, %d, %d, %f\n", s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
   
    }
}
