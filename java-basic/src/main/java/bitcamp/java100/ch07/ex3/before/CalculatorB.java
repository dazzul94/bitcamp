package bitcamp.java100.ch07.ex3.before;

public class CalculatorB {
    int value;

    void multiple(int value) {
        this.value *= value;
    } 
    void divide(int value) {
        if (value == 0) {
            System.err.println("0으로 나눌 수 없습니다!");
            return;
        }
        this.value /= value;
    }
    void remainder(int value) {
        this.value %= value;
    }
}
