package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeInspectTemplateDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecipeInspectTemplateDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeInspectTemplateDetails record);

    int insertSelective(RecipeInspectTemplateDetails record);

    RecipeInspectTemplateDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeInspectTemplateDetails record);

    int updateByPrimaryKey(RecipeInspectTemplateDetails record);

    List<RecipeInspectTemplateDetails> finRecipeInspectTemplateDetailsAndInspet(@Param("reciptId") Integer reciptId);
}