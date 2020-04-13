package cn.bdqn.auth.dao;

import cn.bdqn.auth.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<Permission> getByUserid(Long uid);
}
