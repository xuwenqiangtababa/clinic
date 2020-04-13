package cn.bdqn.auth.dao;

import cn.bdqn.auth.pojo.Role;
import cn.bdqn.auth.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User loadUserByUsername(String username);


    List<Role> getTbUserTbRoleByUid(Long id);
}
