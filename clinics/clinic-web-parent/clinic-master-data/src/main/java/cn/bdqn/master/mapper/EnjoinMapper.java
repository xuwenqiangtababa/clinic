package cn.bdqn.master.mapper;


import cn.bdqn.master.pojo.Enjoin;

import java.util.List;

public interface EnjoinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Enjoin record);

    int insertSelective(Enjoin record);

    Enjoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enjoin record);

    int updateByPrimaryKey(Enjoin record);

    List<Enjoin> finEnjoin();
}