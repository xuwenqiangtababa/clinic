package cn.bdqn.medicine.service.impl;

import cn.bdqn.medicine.mapper.HisInspectTypeMapper;
import cn.bdqn.medicine.pojo.HisInspectType;
import cn.bdqn.medicine.service.HisInspectTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HisInspectTypeServiceImpl implements HisInspectTypeService {

    @Resource
    private HisInspectTypeMapper hisInspectTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hisInspectTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HisInspectType record) {
        return hisInspectTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(HisInspectType record) {
        return hisInspectTypeMapper.insertSelective(record);
    }

    @Override
    public HisInspectType selectByPrimaryKey(Integer id) {
        return hisInspectTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HisInspectType record) {
        return hisInspectTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HisInspectType record) {
        return hisInspectTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HisInspectType> finInspectType() {
        return hisInspectTypeMapper.finInspectType();
    }

}

