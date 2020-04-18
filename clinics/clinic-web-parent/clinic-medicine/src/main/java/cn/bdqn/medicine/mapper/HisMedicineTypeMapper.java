package cn.bdqn.medicine.mapper;

import cn.bdqn.medicine.pojo.HisMedicineType;

import java.util.List;

public interface HisMedicineTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HisMedicineType record);

    int insertSelective(HisMedicineType record);

    HisMedicineType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HisMedicineType record);

    int updateByPrimaryKey(HisMedicineType record);

    List<HisMedicineType> finHisMedicineType();
}