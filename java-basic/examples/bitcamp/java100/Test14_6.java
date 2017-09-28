package bitcamp.java100;  //배열 레퍼런스
public class Test14_6{
    public static void main(String[] args) {
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
            
            void compute() {
                sum = kor + eng + math;
                aver = sum / 3.0f;    
            }
        }
            
//객체의 주소를 저장할 레퍼런스 배열 만들기
        Score [] scores = new Score [3];
        //new Score [3] => Score 객체 주소를 담을 레퍼런스를 3개 준비
        //Scores[] scores => Score 레퍼런스 배열의 주소를 담을 변수
        // (레퍼런스를 담을 레퍼런스)
        scores[0] = new Score();
        scores[1] = new Score();
        scores[2] = new Score();

//배열 레퍼런스를 이용해 각 객체의 필드에 값을 저장한다
        scores[0].name = "홍길동";
        scores[0].kor = 100;
        scores[0].eng = 100;
        scores[0].math = 100;
        scores[0].compute();

        scores[1].name = "임꺽정";
        scores[1].kor = 90;
        scores[1].eng = 90;
        scores[1].math = 90;
        scores[1].compute();
        
        scores[2].name = "유관순";
        scores[2].kor = 100;
        scores[2].eng = 100;
        scores[2].math = 100;
        scores[2].compute();
        
        for (int i =0; i < scores.length; i++) {
            System.out.printf("%s,%d,%d,%d,%d,%f\n",scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);}
    }
}