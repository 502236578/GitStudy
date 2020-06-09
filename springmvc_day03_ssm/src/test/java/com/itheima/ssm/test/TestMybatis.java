package com.itheima.ssm.test;

import com.itheima.ssm.dao.AccountDao;
import com.itheima.ssm.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/7/25 15:56
 * @Version V1.0
 */
public class TestMybatis {

    // 查询所有
    @Test
    public void findAll() throws IOException {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // SqlSession操作数据库的核心
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }

    // 保存
    @Test
    public void save() throws IOException {
        Account account = new Account();
        account.setName("李四");
        account.setMoney(500d);
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // SqlSession操作数据库的核心
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        accountDao.save(account);
        // 事务提交
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
