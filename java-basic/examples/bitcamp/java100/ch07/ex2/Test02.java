package bitcamp.java100.ch07.ex2;

public class Test02 {
    public static void main(String[] args) {
        
        CalculatorA calc = new CalculatorA();
        
        calc.plus(10);
        calc.plus(20);
        calc.minus(7);
        calc.multiple(2);
        calc.divide(3);
        
        System.out.println(calc.result);
    }

}
