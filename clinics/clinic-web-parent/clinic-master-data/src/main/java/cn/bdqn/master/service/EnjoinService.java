package cn.bdqn.master.service;


import cn.bdqn.master.pojo.Enjoin;

import java.util.List;

public interface EnjoinService {


    int deleteByPrimaryKey(Integer id);

    int insert(Enjoin record);

    int insertSelective(Enjoin record);

    Enjoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enjoin record);

    int updateByPrimaryKey(Enjoin record);

    List<Enjoin> finEnjoin();
}

