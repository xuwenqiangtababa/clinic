package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeWestTemplate;

import java.util.List;

public interface RecipeWestTemplateService {


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeWestTemplate record);

    int insertSelective(RecipeWestTemplate record);

    RecipeWestTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeWestTemplate record);

    int updateByPrimaryKey(RecipeWestTemplate record);

    List<RecipeWestTemplate> finRecipeWestTemplateAll(
            Integer reciperType, String jurisdiction, String repiperNumber, String repiperName
    );
}
