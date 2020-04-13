package cn.bdnq.user.service;

import cn.bdnq.user.entity.User;

import java.util.List;


public interface UserServer {

    /**
     * 查询所有用户
     * @return
     */
    List<User> finAll(Integer userId);
}
