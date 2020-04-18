package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeInspectTemplate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecipeInspectTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeInspectTemplate record);

    int insertSelective(RecipeInspectTemplate record);

    RecipeInspectTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeInspectTemplate record);

    int updateByPrimaryKey(RecipeInspectTemplate record);

    List<RecipeInspectTemplate> finRecipeInspectTemplateAll(
            @Param("reciperType") Integer reciperType, @Param("jurisdiction") String jurisdiction, @Param("repiperNumber") String repiperNumber, @Param("repiperName") String repiperName
    );
}