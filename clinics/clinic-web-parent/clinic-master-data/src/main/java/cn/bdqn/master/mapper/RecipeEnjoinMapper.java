package cn.bdqn.master.mapper;

import cn.bdqn.master.pojo.RecipeEnjoin;

public interface RecipeEnjoinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeEnjoin record);

    int insertSelective(RecipeEnjoin record);

    RecipeEnjoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeEnjoin record);

    int updateByPrimaryKey(RecipeEnjoin record);
}