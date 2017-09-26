package bitcamp.java100;
public class Test11_9 {
    public static void main(String[] args) {
        System.out.println(12.375); //2진수로 정확히 바뀜
        System.out.println(12.117); // 2진수로 바뀔때 무한반복, 실제로는 근사값이 저장된다. 가수부의 크기만큼만 저장하고 나머ㄹ지는 짤린다

        System.out.println(214500/1.1);//부동소수점의 값이 완전히 2진수로 바뀌지 못하는 문제 떄문에 소수점 이하의 값이 이상하게 출력된다. 개발자가 코드를 추가해줘야한다 ex 계산기 어플
    
         }
    }