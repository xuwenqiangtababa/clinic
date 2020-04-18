package cn.bdqn.medicine.service;

import cn.bdqn.medicine.pojo.HisInspect;

import java.util.List;

public interface HisInspectService {


    int deleteByPrimaryKey(Integer id);

    int insert(HisInspect record);

    int insertSelective(HisInspect record);

    HisInspect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HisInspect record);

    int updateByPrimaryKey(HisInspect record);

    List<HisInspect> finHisInspect(String name, Integer typeId);
}

