package cn.bdqn.prescription.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.prescription.pojo.RecipeTemplateType;
import cn.bdqn.prescription.mapper.RecipeTemplateTypeMapper;
import cn.bdqn.prescription.service.RecipeTemplateTypeService;
@Service
public class RecipeTemplateTypeServiceImpl implements RecipeTemplateTypeService{

    @Resource
    private RecipeTemplateTypeMapper recipeTemplateTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeTemplateTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeTemplateType record) {
        return recipeTemplateTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeTemplateType record) {
        return recipeTemplateTypeMapper.insertSelective(record);
    }

    @Override
    public RecipeTemplateType selectByPrimaryKey(Integer id) {
        return recipeTemplateTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeTemplateType record) {
        return recipeTemplateTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeTemplateType record) {
        return recipeTemplateTypeMapper.updateByPrimaryKey(record);
    }

}
