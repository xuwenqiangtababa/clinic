package cn.bdqn.master.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Enjoin implements Serializable {
    private Integer id;

    /**
     * 嘱咐名称
     */
    private String enjoinName;

    /**
     * 描述
     */
    private String describe;

    private static final long serialVersionUID = 1L;
}