package cn.bdqn.prescription.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.prescription.pojo.RecipeInspectDrug;
import cn.bdqn.prescription.mapper.RecipeInspectDrugMapper;
import cn.bdqn.prescription.service.RecipeInspectDrugService;
@Service
public class RecipeInspectDrugServiceImpl implements RecipeInspectDrugService{

    @Resource
    private RecipeInspectDrugMapper recipeInspectDrugMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeInspectDrugMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeInspectDrug record) {
        return recipeInspectDrugMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeInspectDrug record) {
        return recipeInspectDrugMapper.insertSelective(record);
    }

    @Override
    public RecipeInspectDrug selectByPrimaryKey(Integer id) {
        return recipeInspectDrugMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeInspectDrug record) {
        return recipeInspectDrugMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeInspectDrug record) {
        return recipeInspectDrugMapper.updateByPrimaryKey(record);
    }

}
