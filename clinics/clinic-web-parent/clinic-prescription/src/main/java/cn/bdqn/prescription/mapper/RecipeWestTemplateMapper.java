package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeWestTemplate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecipeWestTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecipeWestTemplate record);

    int insertSelective(RecipeWestTemplate record);

    RecipeWestTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecipeWestTemplate record);

    int updateByPrimaryKey(RecipeWestTemplate record);

    List<RecipeWestTemplate> finRecipeWestTemplateAll(
            @Param("reciperType") Integer reciperType, @Param("jurisdiction") String jurisdiction, @Param("repiperNumber") String repiperNumber, @Param("repiperName") String repiperName
    );
}