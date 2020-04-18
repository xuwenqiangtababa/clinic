package cn.bdqn.master.service;


import cn.bdqn.master.pojo.Illness;

import java.util.List;

public interface IllnessService {


    int deleteByPrimaryKey(Integer id);

    int insert(Illness record);

    int insertSelective(Illness record);

    Illness selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Illness record);

    int updateByPrimaryKey(Illness record);

    List<Illness> finIllness();
}

