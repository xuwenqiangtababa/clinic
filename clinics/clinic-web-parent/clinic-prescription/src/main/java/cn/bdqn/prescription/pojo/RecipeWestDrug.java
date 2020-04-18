package cn.bdqn.prescription.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeWestDrug implements Serializable {
    private Integer id;

    /**
    * 处方表id
    */
    private Integer recipeId;

    /**
    * 药品id
    */
    private Integer medicineId;

    /**
    * 金额
    */
    private Double price;

    /**
    * 单次用药
    */
    private String pharmacy;

    /**
    * 用法
    */
    private String usage;

    /**
    * 次数
    */
    private String frequentness;

    /**
    * 天数
    */
    private String days;

    /**
    * 创建日期
    */
    private String drugDate;

    private static final long serialVersionUID = 1L;
}