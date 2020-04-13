package cn.bdqn.auth.service;

import cn.bdqn.auth.pojo.Permission;

import java.util.List;

public interface PermissionService {
    /**
     * 查询用户可以访问的地址权限
     *
     * @param uid
     * @return 用户信息，地址信息...
     */
    List<Permission> getByUserid(Long uid);
}
