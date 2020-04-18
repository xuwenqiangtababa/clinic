package cn.bdqn.master.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeIllness implements Serializable {
    private Integer id;

    /**
    * 处方id
    */
    private Integer recipeId;

    /**
    * 疾病id
    */
    private Integer illnessId;

    private static final long serialVersionUID = 1L;
}