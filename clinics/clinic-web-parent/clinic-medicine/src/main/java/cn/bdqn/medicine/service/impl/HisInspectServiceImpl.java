package cn.bdqn.medicine.service.impl;

import cn.bdqn.medicine.mapper.HisInspectMapper;
import cn.bdqn.medicine.pojo.HisInspect;
import cn.bdqn.medicine.service.HisInspectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HisInspectServiceImpl implements HisInspectService {

    @Resource
    private HisInspectMapper hisInspectMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hisInspectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HisInspect record) {
        return hisInspectMapper.insert(record);
    }

    @Override
    public int insertSelective(HisInspect record) {
        return hisInspectMapper.insertSelective(record);
    }

    @Override
    public HisInspect selectByPrimaryKey(Integer id) {
        return hisInspectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HisInspect record) {
        return hisInspectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HisInspect record) {
        return hisInspectMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HisInspect> finHisInspect(String name, Integer typeId) {
        return hisInspectMapper.finHisInspect(name, typeId);
    }

}

