package com.mybatisStudy03one2many.dao;

import com.mybatisStudy03one2many.domain.Account;
import com.mybatisStudy03one2many.domain.AccountUser;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-02-22:12
 */
public interface IAccountDao {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 查询所有账户，并带有用户名称和地址
     * @return
     */
    public List<AccountUser> findAllAccount();
}
