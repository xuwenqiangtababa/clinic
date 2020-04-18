package cn.bdqn.master.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.master.pojo.SeeType;
import cn.bdqn.master.mapper.SeeTypeMapper;
import cn.bdqn.master.service.SeeTypeService;
@Service
public class SeeTypeServiceImpl implements SeeTypeService{

    @Resource
    private SeeTypeMapper seeTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return seeTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SeeType record) {
        return seeTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(SeeType record) {
        return seeTypeMapper.insertSelective(record);
    }

    @Override
    public SeeType selectByPrimaryKey(Integer id) {
        return seeTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SeeType record) {
        return seeTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SeeType record) {
        return seeTypeMapper.updateByPrimaryKey(record);
    }

}
