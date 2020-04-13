package cn.bdqn.auth.service.imp;

import cn.bdqn.auth.dao.PermissionMapper;
import cn.bdqn.auth.pojo.Permission;
import cn.bdqn.auth.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public List<Permission> getByUserid(Long uid) {
        return permissionMapper.getByUserid(uid);
    }
}
