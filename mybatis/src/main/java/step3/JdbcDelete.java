// DBMS 서버에게 SQL문을 보내기 - delete
// => 데이터 입출력 테스트를 위한 테이블 생성하라!
//    bitcamp-docs/jdbcexam.sql 을 실행하라!
// 
package step3;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class JdbcDelete {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step2/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.delete("JdbcTestMapper.delete", 30);
        sqlSession.commit();
        sqlSession.close();
    }

}
