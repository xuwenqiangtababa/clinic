package cn.bdqn.medicine.mapper;

import cn.bdqn.medicine.pojo.HisMedicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HisMedicineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HisMedicine record);

    int insertSelective(HisMedicine record);

    HisMedicine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HisMedicine record);

    int updateByPrimaryKey(HisMedicine record);

    List<HisMedicine> finHisMedicineTypeAndMedicenName(@Param("typeId") Integer typeId, @Param("username") String name);
}