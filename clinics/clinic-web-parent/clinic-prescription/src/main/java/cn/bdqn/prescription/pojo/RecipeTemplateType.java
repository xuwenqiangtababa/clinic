package cn.bdqn.prescription.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RecipeTemplateType implements Serializable {
    private Integer id;

    /**
    * 处方模板类型名称
    */
    private String recipeTemplateTypeName;

    private static final long serialVersionUID = 1L;
}