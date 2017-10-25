public class ScoreDao {
    Score[] scores = new Score[10000];
    
    int cursor;
    
    void add(Score score) {
        if (this.cursor == this.scores.length) {
            System.err.println("최대 저장개수를 초과하였습니다.");
            return;
        }
        this.scores[this.cursor++] = score;
    }
    
    int size() {
        return this.cursor;
    }
    
    Score get(int index) {
        if (index < 0 || index >= this.cursor) {
            return null;
        }
        return this.scores[index];
      
    }

}

