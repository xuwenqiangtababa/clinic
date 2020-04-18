package cn.bdqn.master.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeEnjoin implements Serializable {
    private Integer id;

    /**
    * 处方id
    */
    private Integer recipeId;

    /**
    * 医嘱id
    */
    private Integer enjoinId;

    private static final long serialVersionUID = 1L;
}