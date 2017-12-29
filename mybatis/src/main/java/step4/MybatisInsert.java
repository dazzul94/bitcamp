package step4;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step4/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String, Object> data = new HashMap<>();
        data.put("title", "오호라~제목이래용");
        data.put("contents", "내용이당");
        
        int count = sqlSession.insert("JdbcTestMapper.insert", data);
        System.out.printf("%d 개가 입력되었습니다", count);
        
        sqlSession.commit();
        sqlSession.close();
    }
}
