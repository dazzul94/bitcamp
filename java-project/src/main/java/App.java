public class App {

    public static void main(String[] args) {
        class Score {
            String names;
            int subjects[] = new int[3];
            int sum;
            float aver;
        }
        
//        Score[] scores = new Score[3];
//        scores[0] = new Score();
//        scores[1] = new Score();
//        scores[2] = new Scored();
        Score[] scores = {new Score(), new Score(), new Score()};
        
        scores[0].names = "홍길동";
        scores[0].subjects[0] = 100;
        scores[0].subjects[1] = 90;
        scores[0].subjects[2] = 80;
        for (int sub : scores[0].subjects) { //sub는 로컬변수
            scores[0].sum += sub;
        }
        scores[0].aver = scores[0].sum / 3.f;
        
        scores[1].names = "임꺽정";
        scores[1].subjects[0] = 80;
        scores[1].subjects[1] = 80;
        scores[1].subjects[2] = 80;
        for (int sub : scores[1].subjects) { //sub는 로컬변수
            scores[1].sum += sub;
        }
        scores[1].aver = scores[1].sum / 3.f;
        
        scores[2].names = "유관순";
        scores[2].subjects[0] = 100;
        scores[2].subjects[1] = 100;
        scores[2].subjects[2] = 100;
        for (int sub : scores[2].subjects) { //sub는 로컬변수
            scores[2].sum += sub;
        }
        scores[2].aver = scores[2].sum / 3.f;

        for (Score s : scores) {
            System.out.printf("%-4s, %4d %4d %4d %4d %6.1f\n",
                    s.names, s.subjects[0], s.subjects[1], s.subjects[2], s.sum, s.aver);
        }
    }
}
