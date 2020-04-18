package cn.bdqn.master.service.impl;


import cn.bdqn.master.mapper.AdditionMapper;
import cn.bdqn.master.pojo.Addition;
import cn.bdqn.master.service.AdditionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdditionServiceImpl implements AdditionService {

    @Resource
    private AdditionMapper additionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return additionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Addition record) {
        return additionMapper.insert(record);
    }

    @Override
    public int insertSelective(Addition record) {
        return additionMapper.insertSelective(record);
    }

    @Override
    public Addition selectByPrimaryKey(Integer id) {
        return additionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Addition record) {
        return additionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Addition record) {
        return additionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Addition> finAdditionAll() {
        return additionMapper.finAdditionAll();
    }

}

