package cn.bdnq.user.dao;

import cn.bdnq.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from tb_user where id=${userId}")
    public List<User> finAll(Integer userId);
}
