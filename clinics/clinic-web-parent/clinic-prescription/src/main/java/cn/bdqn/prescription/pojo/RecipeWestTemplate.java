package cn.bdqn.prescription.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class RecipeWestTemplate implements Serializable {
    /**
    * 西药模板id
    */
    private Integer id;

    /**
    * 模板编号
    */
    private String templateNumber;

    /**
    * 模板姓名
    */
    private String templateName;

    /**
    * 诊断
    */
    private String diagnose;

    /**
    * 描述
    */
    private String describe;

    /**
    * 模板创建人
    */
    private String templateCreator;

    /**
    * 创建时间
    */
    private Date creatorDate;

    /**
    * 处方模板类型Id
    */
    private String recipeTemplateTypeId;

    /**
    * 模板权限
    */
    private String jurisdiction;

    private RecipeTemplateType recipeTemplateType;

    private static final long serialVersionUID = 1L;
}