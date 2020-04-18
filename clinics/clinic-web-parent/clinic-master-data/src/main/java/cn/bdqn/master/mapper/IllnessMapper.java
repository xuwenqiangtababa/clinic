package cn.bdqn.master.mapper;


import cn.bdqn.master.pojo.Illness;

import java.util.List;

public interface IllnessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Illness record);

    int insertSelective(Illness record);

    Illness selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Illness record);

    int updateByPrimaryKey(Illness record);

    List<Illness> finIllness();
}