package com.mybatisStudy03one2many.dao;

import com.mybatisStudy03one2many.domain.User;
import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-02-20:59
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    User findById(Integer userId);
}
