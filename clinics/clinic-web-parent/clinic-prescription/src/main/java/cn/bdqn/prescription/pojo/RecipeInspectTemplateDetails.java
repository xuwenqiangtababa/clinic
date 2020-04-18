package cn.bdqn.prescription.pojo;

import cn.bdqn.medicine.pojo.HisInspect;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RecipeInspectTemplateDetails implements Serializable {
    private Integer id;

    /**
    * 检查模块id
    */
    private Integer recipeInspectTypeId;

    /**
    * 检查项目id
    */
    private Integer hisInspectId;

    /**
    * 检查部位
    */
    private String inspectPart;

    /**
    * 次数
    */
    private Integer number;

    /**
    * 金额
    */
    private Double inspectPrice;

    /**
    * 备注
    */
    private String remark;

    /**
     * 调用检查模块类
     */
    private HisInspect hisInspect;

    private static final long serialVersionUID = 1L;
}