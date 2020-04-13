package cn.bdqn.auth.service.imp;

import cn.bdqn.auth.dao.UserMapper;
import cn.bdqn.auth.pojo.Role;
import cn.bdqn.auth.pojo.User;
import cn.bdqn.auth.service.UserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapperServiceImpl implements UserMapperService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User loadUserByUsername(String username) {
        return userMapper.loadUserByUsername(username);
    }

    @Override
    public List<Role> getTbUserTbRoleByUid(Long id) {
        return userMapper.getTbUserTbRoleByUid(id);
    }
}
