package step12;

import java.util.List;
import java.util.Map;

public interface BoardDao {

    public List<Board> findAll(Map<String, Object> data);

    public Board findByNo(int no);

    public int insert(Board board);

    public int update(Board board);

    public int delete(int no);
}
