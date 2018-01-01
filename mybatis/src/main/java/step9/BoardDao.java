package step9;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BoardDao {
    SqlSessionFactory sqlSessionFactory;

    public SqlSessionFactory setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
        return this.sqlSessionFactory;
    }

    public int delete(int no) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();

        int count = sqlSession.delete("JdbcTestMapper.delete", no);

        sqlSession.commit();
        return count;
    }

}
