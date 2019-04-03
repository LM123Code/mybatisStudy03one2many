package com.mybatisStudy03one2many.dao;

import com.mybatisStudy03one2many.domain.Account;
import com.mybatisStudy03one2many.domain.AccountUser;
import com.mybatisStudy03one2many.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-02-22:26
 */
public class IAccountDaoTest {
    SqlSession sqlSession = null;
    IAccountDao accountDao = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.close(sqlSession);
    }
    @Test
    public void testFindAll(){
        List<Account> list = accountDao.findAll();
        for(Account account:list){
            System.out.println("---------------------");
            System.out.println(account);
            System.out.println(account.getUser());
        }
        Assert.assertNotNull(list);
    }
    @Test
    public void testFindAllAccount(){
        List<AccountUser> list = accountDao.findAllAccount();
        for(AccountUser accountUser: list){
            System.out.println(accountUser);
        }
        Assert.assertNotNull(list);
    }
}
