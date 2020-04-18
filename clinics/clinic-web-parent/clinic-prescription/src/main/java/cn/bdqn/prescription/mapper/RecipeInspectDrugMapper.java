package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeInspectDrug;

public interface RecipeInspectDrugMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeInspectDrug record);

    int insertSelective(RecipeInspectDrug record);

    RecipeInspectDrug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeInspectDrug record);

    int updateByPrimaryKey(RecipeInspectDrug record);
}