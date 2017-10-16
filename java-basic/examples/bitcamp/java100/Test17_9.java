package bitcamp.java100;
//메서드
//7) 값을 받아서 계산한 후 그 결과를 리턴하는 메서드
public class Test17_9 {
    static class Score {
        String name;
        int[] subjects = new int[3];//여기서 배열을 만들어줘야함(메모리가 없어서 밑에서 대입을 못함)
        int sum;
        float aver;
    }
    static Score createMember(String name, int kor, int eng, int math) {
        Score s = new Score();
        s.name = name;
        s.subjects[0] = kor;
        s.subjects[1] = eng;
        s.subjects[2] = math;
        s.sum = kor + eng + math;
        s.aver = s.sum / 3f;
        
        return s; //s에 저장되어 있는 주소를 리턴
    }
    //int 값 두개 받아서 계산을 한 후 int 값 한개를 리턴하는 메서드
    static int exp(int value, int ex) {
        int sum = 1;
        for (int i = 0; i < ex; i++) {
            sum *= value;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Score scores = createMember("홍길동", 100, 90, 80);
        
        
        System.out.println(scores.name);
        System.out.println(scores.subjects[0]);
        System.out.println(scores.subjects[1]);
        System.out.println(scores.subjects[2]);
        System.out.println(scores.sum);
        System.out.println(scores.aver);

         System.out.println("-------------------------------------------");
        //2의 8승을 구해보자
        int result = exp(2, 8);
        System.out.println(result);
    }      
}
