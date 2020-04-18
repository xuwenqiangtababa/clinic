package cn.bdqn.medicine.service.impl;

import cn.bdqn.medicine.mapper.HisMedicineTypeMapper;
import cn.bdqn.medicine.pojo.HisMedicineType;
import cn.bdqn.medicine.service.HisMedicineTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HisMedicineTypeServiceImpl implements HisMedicineTypeService {

    @Resource
    private HisMedicineTypeMapper hisMedicineTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hisMedicineTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HisMedicineType record) {
        return hisMedicineTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(HisMedicineType record) {
        return hisMedicineTypeMapper.insertSelective(record);
    }

    @Override
    public HisMedicineType selectByPrimaryKey(Integer id) {
        return hisMedicineTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HisMedicineType record) {
        return hisMedicineTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HisMedicineType record) {
        return hisMedicineTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HisMedicineType> finHisMedicineType() {
        return hisMedicineTypeMapper.finHisMedicineType();
    }

}
