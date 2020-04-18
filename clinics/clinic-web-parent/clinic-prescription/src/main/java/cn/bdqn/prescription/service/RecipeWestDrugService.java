package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeWestDrug;
public interface RecipeWestDrugService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeWestDrug record);

    int insertSelective(RecipeWestDrug record);

    RecipeWestDrug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeWestDrug record);

    int updateByPrimaryKey(RecipeWestDrug record);

}
