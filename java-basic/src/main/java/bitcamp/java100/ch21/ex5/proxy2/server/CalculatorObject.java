package bitcamp.java100.ch21.ex5.proxy2.server;

public class CalculatorObject implements bitcamp.java100.ch21.ex5.proxy2.Calculator {

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

}
