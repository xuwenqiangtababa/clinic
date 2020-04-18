package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeTemplateType;

public interface RecipeTemplateTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeTemplateType record);

    int insertSelective(RecipeTemplateType record);

    RecipeTemplateType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeTemplateType record);

    int updateByPrimaryKey(RecipeTemplateType record);
}