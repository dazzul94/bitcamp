// DBMS 서버에게 SQL문을 보내기 - insert
// => 데이터 입출력 테스트를 위한 테이블 생성하라!
//    bitcamp-docs/jdbcexam.sql 을 실행하라!
// 
package step3;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class JdbcInsert {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step3/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String, Object> map = new HashMap<>();
        map.put("title", "제목~");
        map.put("conts", "내용~");
        int count = sqlSession.insert("JdbcTestMapper.insert", map);
        sqlSession.commit();
        sqlSession.close();
    }

}









