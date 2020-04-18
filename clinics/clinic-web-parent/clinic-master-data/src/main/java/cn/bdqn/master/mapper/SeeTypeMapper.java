package cn.bdqn.master.mapper;

import cn.bdqn.master.pojo.SeeType;
import org.apache.ibatis.annotations.Mapper;

public interface SeeTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeeType record);

    int insertSelective(SeeType record);

    SeeType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SeeType record);

    int updateByPrimaryKey(SeeType record);
}