package com.wbl.service.impl;

import com.wbl.dao.UsersDao;
import com.wbl.pojo.Users;
import com.wbl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wbl
 * @Date: 2019/3/17
 * @Description: com.wbl.service.com.wbl.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public void addUser(Users users) {

        this.usersDao.insertUser(users);
    }
}
