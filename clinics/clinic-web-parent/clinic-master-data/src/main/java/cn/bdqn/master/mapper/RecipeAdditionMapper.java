package cn.bdqn.master.mapper;

import cn.bdqn.master.pojo.RecipeAddition;

public interface RecipeAdditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeAddition record);

    int insertSelective(RecipeAddition record);

    RecipeAddition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeAddition record);

    int updateByPrimaryKey(RecipeAddition record);
}