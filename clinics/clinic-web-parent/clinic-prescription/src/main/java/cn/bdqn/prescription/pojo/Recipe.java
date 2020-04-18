package cn.bdqn.prescription.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Recipe implements Serializable {
    private Integer id;

    /**
     * （1:西药/2:检查）
     */
    private Integer recipeType;

    /**
     * 医生id
     */
    private Integer doctorId;

    /**
     * 患者id
     */
    private Integer patientId;

    /**
     * 医嘱id
     */
    private Integer enjoinId;

    /**
     * 疾病id
     */
    private Integer illnessId;

    /**
     * 附加费用id
     */
    private Integer additionId;

    private static final long serialVersionUID = 1L;

    public static RecipeBuilder builder() {
        return new RecipeBuilder();
    }
}