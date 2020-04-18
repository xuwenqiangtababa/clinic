package cn.bdqn.prescription.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.prescription.mapper.RecipeWestDrugMapper;
import cn.bdqn.prescription.pojo.RecipeWestDrug;
import cn.bdqn.prescription.service.RecipeWestDrugService;
@Service
public class RecipeWestDrugServiceImpl implements RecipeWestDrugService{

    @Resource
    private RecipeWestDrugMapper recipeWestDrugMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeWestDrugMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeWestDrug record) {
        return recipeWestDrugMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeWestDrug record) {
        return recipeWestDrugMapper.insertSelective(record);
    }

    @Override
    public RecipeWestDrug selectByPrimaryKey(Integer id) {
        return recipeWestDrugMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeWestDrug record) {
        return recipeWestDrugMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeWestDrug record) {
        return recipeWestDrugMapper.updateByPrimaryKey(record);
    }

}
