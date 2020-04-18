package cn.bdqn.medicine.mapper;

import cn.bdqn.medicine.pojo.HisInspectType;

import java.util.List;

public interface HisInspectTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HisInspectType record);

    int insertSelective(HisInspectType record);

    HisInspectType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HisInspectType record);

    int updateByPrimaryKey(HisInspectType record);

    List<HisInspectType> finInspectType();
}