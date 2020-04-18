package cn.bdqn.master.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.master.pojo.RecipeAddition;
import cn.bdqn.master.mapper.RecipeAdditionMapper;
import cn.bdqn.master.service.RecipeAdditionService;
@Service
public class RecipeAdditionServiceImpl implements RecipeAdditionService{

    @Resource
    private RecipeAdditionMapper recipeAdditionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeAdditionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeAddition record) {
        return recipeAdditionMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeAddition record) {
        return recipeAdditionMapper.insertSelective(record);
    }

    @Override
    public RecipeAddition selectByPrimaryKey(Integer id) {
        return recipeAdditionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeAddition record) {
        return recipeAdditionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeAddition record) {
        return recipeAdditionMapper.updateByPrimaryKey(record);
    }

}
