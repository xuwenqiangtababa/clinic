package cn.bdqn.master.mapper;

import cn.bdqn.master.pojo.RecipeIllness;

public interface RecipeIllnessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeIllness record);

    int insertSelective(RecipeIllness record);

    RecipeIllness selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeIllness record);

    int updateByPrimaryKey(RecipeIllness record);
}