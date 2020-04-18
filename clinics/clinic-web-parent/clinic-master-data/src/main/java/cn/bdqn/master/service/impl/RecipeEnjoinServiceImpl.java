package cn.bdqn.master.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.bdqn.master.mapper.RecipeEnjoinMapper;
import cn.bdqn.master.pojo.RecipeEnjoin;
import cn.bdqn.master.service.RecipeEnjoinService;
@Service
public class RecipeEnjoinServiceImpl implements RecipeEnjoinService{

    @Resource
    private RecipeEnjoinMapper recipeEnjoinMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recipeEnjoinMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecipeEnjoin record) {
        return recipeEnjoinMapper.insert(record);
    }

    @Override
    public int insertSelective(RecipeEnjoin record) {
        return recipeEnjoinMapper.insertSelective(record);
    }

    @Override
    public RecipeEnjoin selectByPrimaryKey(Integer id) {
        return recipeEnjoinMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RecipeEnjoin record) {
        return recipeEnjoinMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecipeEnjoin record) {
        return recipeEnjoinMapper.updateByPrimaryKey(record);
    }

}
