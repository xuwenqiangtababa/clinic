package cn.bdqn.prescription.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.prescription.pojo.Recipe;
import cn.bdqn.prescription.mapper.RecipeMapper;
import cn.bdqn.prescription.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Resource
    private RecipeMapper recipeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Recipe record) {
        return recipeMapper.insert(record);
    }

    @Override
    public int insertSelective(Recipe record) {
        return recipeMapper.insertSelective(record);
    }

    @Override
    public Recipe selectByPrimaryKey(Integer id) {
        return recipeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Recipe record) {
        return recipeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Recipe record) {
        return recipeMapper.updateByPrimaryKey(record);
    }

}

