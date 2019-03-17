package com.wbl.dao;

import com.wbl.pojo.Users;

import java.util.List;

/**
 * @Auther: wbl
 * @Date: 2019/3/17
 * @Description: com.wbl.dao
 * @version: 1.0
 */
public interface UsersDao {

    void insertUser(Users users);

    List<Users> selectUserAll();
}
