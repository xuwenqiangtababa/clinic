package cn.bdqn.master.service;

import cn.bdqn.master.pojo.RecipeAddition;
public interface RecipeAdditionService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeAddition record);

    int insertSelective(RecipeAddition record);

    RecipeAddition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeAddition record);

    int updateByPrimaryKey(RecipeAddition record);

}
