package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeInspectDrug;
public interface RecipeInspectDrugService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeInspectDrug record);

    int insertSelective(RecipeInspectDrug record);

    RecipeInspectDrug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeInspectDrug record);

    int updateByPrimaryKey(RecipeInspectDrug record);

}
