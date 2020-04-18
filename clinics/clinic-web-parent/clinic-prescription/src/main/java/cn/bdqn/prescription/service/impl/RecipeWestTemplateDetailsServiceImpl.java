package cn.bdqn.prescription.service.impl;

import cn.bdqn.prescription.mapper.RecipeWestTemplateDetailsMapper;
import cn.bdqn.prescription.pojo.RecipeWestTemplateDetails;
import cn.bdqn.prescription.service.RecipeWestTemplateDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecipeWestTemplateDetailsServiceImpl implements RecipeWestTemplateDetailsService{

    @Resource
    private RecipeWestTemplateDetailsMapper recipeWestTemplateDetailsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeWestTemplateDetailsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeWestTemplateDetails record) {
        return recipeWestTemplateDetailsMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeWestTemplateDetails record) {
        return recipeWestTemplateDetailsMapper.insertSelective(record);
    }

    @Override
    public RecipeWestTemplateDetails selectByPrimaryKey(Integer id) {
        return recipeWestTemplateDetailsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeWestTemplateDetails record) {
        return recipeWestTemplateDetailsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeWestTemplateDetails record) {
        return recipeWestTemplateDetailsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RecipeWestTemplateDetails> finRecipeWestTemplateDetailsPage(Integer westTypeId) {
        return recipeWestTemplateDetailsMapper.finRecipeWestTemplateDetailsPage(westTypeId);
    }

}
