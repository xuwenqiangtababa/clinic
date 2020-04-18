package cn.bdqn.master.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeAddition implements Serializable {
    private Integer id;

    /**
    * 处方id
    */
    private Integer recipeId;

    /**
    * 附加费用id
    */
    private Integer additionId;

    private static final long serialVersionUID = 1L;
}