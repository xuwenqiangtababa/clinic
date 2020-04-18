package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.Recipe;

public interface RecipeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    Recipe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);
}