package bitcamp.java100;

public class Test15_13{
    public static void main(String[] args) {
    //복합대입연산자
        int sum = 0;
        
        //일반 대입(할당) 연산자
        sum = sum + 100;
        sum = sum + 100;
        System.out.println(sum);

        //복합 대입 연산자
        sum = 0;
        sum += 100;
        sum += 100;
        System.out.println(sum);
        
        
    }
}