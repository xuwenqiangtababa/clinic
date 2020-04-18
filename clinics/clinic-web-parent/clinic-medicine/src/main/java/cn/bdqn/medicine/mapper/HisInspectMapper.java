package cn.bdqn.medicine.mapper;

import cn.bdqn.medicine.pojo.HisInspect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HisInspectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HisInspect record);

    int insertSelective(HisInspect record);

    HisInspect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HisInspect record);

    int updateByPrimaryKey(HisInspect record);

    List<HisInspect> finHisInspect(@Param("name") String name, @Param("typeId") Integer typeId);
}