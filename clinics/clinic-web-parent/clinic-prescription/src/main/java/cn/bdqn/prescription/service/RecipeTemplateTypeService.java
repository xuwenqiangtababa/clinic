package cn.bdqn.prescription.service;

import cn.bdqn.prescription.pojo.RecipeTemplateType;
public interface RecipeTemplateTypeService{


    int deleteByPrimaryKey(Integer id);

    int insert(RecipeTemplateType record);

    int insertSelective(RecipeTemplateType record);

    RecipeTemplateType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeTemplateType record);

    int updateByPrimaryKey(RecipeTemplateType record);

}
