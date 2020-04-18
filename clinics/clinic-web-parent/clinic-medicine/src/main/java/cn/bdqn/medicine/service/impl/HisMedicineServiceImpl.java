package cn.bdqn.medicine.service.impl;

import cn.bdqn.medicine.mapper.HisMedicineMapper;
import cn.bdqn.medicine.pojo.HisMedicine;
import cn.bdqn.medicine.service.HisMedicineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HisMedicineServiceImpl implements HisMedicineService {

    @Resource
    private HisMedicineMapper hisMedicineMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return hisMedicineMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HisMedicine record) {
        return hisMedicineMapper.insert(record);
    }

    @Override
    public int insertSelective(HisMedicine record) {
        return hisMedicineMapper.insertSelective(record);
    }

    @Override
    public HisMedicine selectByPrimaryKey(Long id) {
        return hisMedicineMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HisMedicine record) {
        return hisMedicineMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HisMedicine record) {
        return hisMedicineMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HisMedicine> finHisMedicineTypeAndMedicenName(Integer typeId, String name) {
        return hisMedicineMapper.finHisMedicineTypeAndMedicenName(typeId, name);
    }

}
