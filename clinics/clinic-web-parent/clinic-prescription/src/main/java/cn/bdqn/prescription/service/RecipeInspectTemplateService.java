package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeInspectTemplate;

import java.util.List;

public interface RecipeInspectTemplateService {


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeInspectTemplate record);

    int insertSelective(RecipeInspectTemplate record);

    RecipeInspectTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeInspectTemplate record);

    int updateByPrimaryKey(RecipeInspectTemplate record);

    List<RecipeInspectTemplate> finRecipeInspectTemplateAll(
            Integer reciperType, String jurisdiction, String repiperNumber, String repiperName
    );
}
