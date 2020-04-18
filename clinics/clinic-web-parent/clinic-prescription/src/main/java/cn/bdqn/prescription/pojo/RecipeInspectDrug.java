package cn.bdqn.prescription.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeInspectDrug implements Serializable {
    private Integer id;

    /**
    * 处方表id
    */
    private Integer recipeId;

    /**
    * 检查项目Id
    */
    private Integer inspectId;

    /**
    * 金额
    */
    private Double price;

    /**
    * 检查项目
    */
    private String inspectPart;

    /**
    * 检查次数
    */
    private String number;

    /**
    * 创建时间
    */
    private Date createDate;

    private static final long serialVersionUID = 1L;
}