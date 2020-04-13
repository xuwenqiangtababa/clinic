package cn.bdnq.user.service.impl;

import cn.bdnq.user.dao.UserDao;
import cn.bdnq.user.entity.User;
import cn.bdnq.user.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> finAll(Integer userId) {
        return userDao.finAll(userId);
    }
}
