package step8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectList {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step8/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map<String,Object> data = new HashMap<>();
        data.put("orderColumn", "regdt");
        data.put("align", "desc");

        List<String> words = new ArrayList<String>();
        words.add("aa");
        words.add("1");
        words.add("5");
        
        data.put("words", words);
        
        List<Board> records = sqlSession.selectList("JdbcTestMapper.findAll", data);
        for (Board board : records) { //record는 Map객체이다
            System.out.printf("%d, %s, %s, %s\n", board.getNo(), board.getTitle(), board.getCreatedDate(), board.getViewCount());
        }
        
        sqlSession.close();
    }
}
