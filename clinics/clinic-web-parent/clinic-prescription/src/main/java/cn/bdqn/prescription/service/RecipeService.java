package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.Recipe;

public interface RecipeService {


    int deleteByPrimaryKey(Integer id);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    Recipe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);

}

