package cn.bdqn.prescription.pojo;

import cn.bdqn.medicine.pojo.HisMedicine;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RecipeWestTemplateDetails implements Serializable {
    private Integer id;

    /**
     * 处方模板id
     */
    private Integer recipeTemplateId;

    /**
     * 药品id
     */
    private Integer medicineId;

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
     * 调用药品信息类
     */
    private HisMedicine hisMedicine;

    private static final long serialVersionUID = 1L;
}