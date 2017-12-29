package step7;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step7/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Board board = new Board();
        board.setTitle("오호라~제목이래용");
        board.setContents("내용이당");
        
        int count = sqlSession.insert("JdbcTestMapper.insert", board);
        System.out.printf("%d 개가 입력되었습니다", count);
        
        sqlSession.commit();
        sqlSession.close();
    }
}
