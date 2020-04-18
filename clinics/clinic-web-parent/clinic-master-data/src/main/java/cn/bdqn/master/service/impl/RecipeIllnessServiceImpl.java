package cn.bdqn.master.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.master.mapper.RecipeIllnessMapper;
import cn.bdqn.master.pojo.RecipeIllness;
import cn.bdqn.master.service.RecipeIllnessService;
@Service
public class RecipeIllnessServiceImpl implements RecipeIllnessService{

    @Resource
    private RecipeIllnessMapper recipeIllnessMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeIllnessMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeIllness record) {
        return recipeIllnessMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeIllness record) {
        return recipeIllnessMapper.insertSelective(record);
    }

    @Override
    public RecipeIllness selectByPrimaryKey(Integer id) {
        return recipeIllnessMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeIllness record) {
        return recipeIllnessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeIllness record) {
        return recipeIllnessMapper.updateByPrimaryKey(record);
    }

}
