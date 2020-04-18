package cn.bdqn.master.mapper;


import cn.bdqn.master.pojo.Addition;

import java.util.List;
public interface AdditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Addition record);

    int insertSelective(Addition record);

    Addition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Addition record);

    int updateByPrimaryKey(Addition record);

    List<Addition> finAdditionAll();
}