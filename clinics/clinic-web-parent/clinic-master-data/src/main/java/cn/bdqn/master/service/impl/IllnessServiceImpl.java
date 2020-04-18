package cn.bdqn.master.service.impl;


import cn.bdqn.master.mapper.IllnessMapper;
import cn.bdqn.master.pojo.Illness;
import cn.bdqn.master.service.IllnessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IllnessServiceImpl implements IllnessService {

    @Resource
    private IllnessMapper illnessMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return illnessMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Illness record) {
        return illnessMapper.insert(record);
    }

    @Override
    public int insertSelective(Illness record) {
        return illnessMapper.insertSelective(record);
    }

    @Override
    public Illness selectByPrimaryKey(Integer id) {
        return illnessMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Illness record) {
        return illnessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Illness record) {
        return illnessMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Illness> finIllness() {
        return illnessMapper.finIllness();
    }

}

