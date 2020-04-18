package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeWestTemplateDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecipeWestTemplateDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeWestTemplateDetails record);

    int insertSelective(RecipeWestTemplateDetails record);

    RecipeWestTemplateDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeWestTemplateDetails record);

    int updateByPrimaryKey(RecipeWestTemplateDetails record);

    List<RecipeWestTemplateDetails> finRecipeWestTemplateDetailsPage(@Param("typeId") Integer westTypeId);
}