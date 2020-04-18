package cn.bdqn.prescription.service.impl;

import cn.bdqn.prescription.mapper.RecipeInspectTemplateDetailsMapper;
import cn.bdqn.prescription.pojo.RecipeInspectTemplateDetails;
import cn.bdqn.prescription.service.RecipeInspectTemplateDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecipeInspectTemplateDetailsServiceImpl implements RecipeInspectTemplateDetailsService {

    @Resource
    private RecipeInspectTemplateDetailsMapper recipeInspectTemplateDetailsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeInspectTemplateDetailsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeInspectTemplateDetails record) {
        return recipeInspectTemplateDetailsMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeInspectTemplateDetails record) {
        return recipeInspectTemplateDetailsMapper.insertSelective(record);
    }

    @Override
    public RecipeInspectTemplateDetails selectByPrimaryKey(Integer id) {
        return recipeInspectTemplateDetailsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeInspectTemplateDetails record) {
        return recipeInspectTemplateDetailsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeInspectTemplateDetails record) {
        return recipeInspectTemplateDetailsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RecipeInspectTemplateDetails> finRecipeInspectTemplateDetailsAndInspet(Integer reciptId) {
        return recipeInspectTemplateDetailsMapper.finRecipeInspectTemplateDetailsAndInspet(reciptId);
    }

}
