package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeInspectTemplateDetails;

import java.util.List;

public interface RecipeInspectTemplateDetailsService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeInspectTemplateDetails record);

    int insertSelective(RecipeInspectTemplateDetails record);

    RecipeInspectTemplateDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeInspectTemplateDetails record);

    int updateByPrimaryKey(RecipeInspectTemplateDetails record);

    List<RecipeInspectTemplateDetails> finRecipeInspectTemplateDetailsAndInspet(Integer reciptId);
}
