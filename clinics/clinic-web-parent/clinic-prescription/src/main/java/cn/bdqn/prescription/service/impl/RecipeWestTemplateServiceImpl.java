package cn.bdqn.prescription.service.impl;

import cn.bdqn.prescription.mapper.RecipeWestTemplateMapper;
import cn.bdqn.prescription.pojo.RecipeWestTemplate;
import cn.bdqn.prescription.service.RecipeWestTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecipeWestTemplateServiceImpl implements RecipeWestTemplateService {

    @Resource
    private RecipeWestTemplateMapper recipeWestTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeWestTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeWestTemplate record) {
        return recipeWestTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeWestTemplate record) {
        return recipeWestTemplateMapper.insertSelective(record);
    }

    @Override
    public RecipeWestTemplate selectByPrimaryKey(Integer id) {
        return recipeWestTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeWestTemplate record) {
        return recipeWestTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeWestTemplate record) {
        return recipeWestTemplateMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RecipeWestTemplate> finRecipeWestTemplateAll(Integer reciperType, String jurisdiction, String repiperNumber, String repiperName) {
        return recipeWestTemplateMapper.finRecipeWestTemplateAll(reciperType, jurisdiction, repiperNumber, repiperName);
    }

}
