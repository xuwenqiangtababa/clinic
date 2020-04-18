package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeWestTemplateDetails;

import java.util.List;

public interface RecipeWestTemplateDetailsService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeWestTemplateDetails record);

    int insertSelective(RecipeWestTemplateDetails record);

    RecipeWestTemplateDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeWestTemplateDetails record);

    int updateByPrimaryKey(RecipeWestTemplateDetails record);

    List<RecipeWestTemplateDetails> finRecipeWestTemplateDetailsPage(Integer westTypeId);
}
