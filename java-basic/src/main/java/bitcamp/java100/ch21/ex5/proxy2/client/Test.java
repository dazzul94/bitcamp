package bitcamp.java100.ch21.ex5.proxy2.client;

public class Test {
    public static void main(String[] args) {
        bitcamp.java100.ch21.ex5.proxy2.Calculator worker = new CalculatorStub(10, 20);
        System.out.println(worker.plus(10, 20));
        System.out.println(worker.minus(10, 20));
    }
}
