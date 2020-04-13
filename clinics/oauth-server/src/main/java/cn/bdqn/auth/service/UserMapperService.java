package cn.bdqn.auth.service;

import cn.bdqn.auth.pojo.Role;
import cn.bdqn.auth.pojo.User;

import java.util.List;

public interface UserMapperService {
    /**
     * 查询用户信息
     *
     * @param username
     * @return
     */
    User loadUserByUsername(String username);

    /**
     * 查询用户级别
     *
     * @param id
     * @return
     */
    List<Role> getTbUserTbRoleByUid(Long id);
}
