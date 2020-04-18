package cn.bdqn.medicine.service;

import cn.bdqn.medicine.pojo.HisMedicine;

import java.util.List;

public interface HisMedicineService {


    int deleteByPrimaryKey(Long id);

    int insert(HisMedicine record);

    int insertSelective(HisMedicine record);

    HisMedicine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HisMedicine record);

    int updateByPrimaryKey(HisMedicine record);

    List<HisMedicine> finHisMedicineTypeAndMedicenName(Integer typeId,String name);
}
