package bitcamp.java100;  
public class Test15_4{
    public static void main(String[] args) {
        //암시적 형변환으로 해결할 수가 없는 경우
        float f1 = 3.141592f;
        int i1 = 7654321;
        System.out.printf("f1=%f, i1=%d\n", f1, i1);
        
        double r1 = f1 + i1; //7654324.141592 유효숫자 때문에 뒤에 소수점 짤림
        System.out.println(r1);//두 옳은 값을 계산했는데 결과가 옳지않다.

        //명시적 형변환으로 해결
        r1 = (double) f1 + (double) i1; // 1)(바꾸고자하는타입) 변수
        System.out.println(r1);
        r1 =(double) f1 + i1; //i1 이 암시적 형변환으로 
        r1 = f1 + (double) i1; //f1 이 암시적 형변환으로

        r1 =(double)3.141592f + (double)7654321;
        System.out.println(r1);

        //왜 뒤에 026 생기지?ㅠㅠㅠㅠㅠㅠ
    }
}