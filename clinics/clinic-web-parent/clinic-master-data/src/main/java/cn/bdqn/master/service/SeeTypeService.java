package cn.bdqn.master.service;

import cn.bdqn.master.pojo.SeeType;
public interface SeeTypeService{


    int deleteByPrimaryKey(Integer id);

    int insert(SeeType record);

    int insertSelective(SeeType record);

    SeeType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SeeType record);

    int updateByPrimaryKey(SeeType record);

}
