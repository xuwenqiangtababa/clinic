package cn.bdqn.master.service;

import cn.bdqn.master.pojo.RecipeIllness;
public interface RecipeIllnessService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeIllness record);

    int insertSelective(RecipeIllness record);

    RecipeIllness selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeIllness record);

    int updateByPrimaryKey(RecipeIllness record);

}
