package cn.bdqn.prescription.service.impl;

import cn.bdqn.prescription.mapper.RecipeInspectTemplateMapper;
import cn.bdqn.prescription.pojo.RecipeInspectTemplate;
import cn.bdqn.prescription.service.RecipeInspectTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecipeInspectTemplateServiceImpl implements RecipeInspectTemplateService {

    @Resource
    private RecipeInspectTemplateMapper recipeInspectTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeInspectTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeInspectTemplate record) {
        return recipeInspectTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeInspectTemplate record) {
        return recipeInspectTemplateMapper.insertSelective(record);
    }

    @Override
    public RecipeInspectTemplate selectByPrimaryKey(Integer id) {
        return recipeInspectTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeInspectTemplate record) {
        return recipeInspectTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeInspectTemplate record) {
        return recipeInspectTemplateMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RecipeInspectTemplate> finRecipeInspectTemplateAll(Integer reciperType, String jurisdiction, String repiperNumber, String repiperName) {
        return recipeInspectTemplateMapper.finRecipeInspectTemplateAll(reciperType, jurisdiction, repiperNumber, repiperName);
    }

}
