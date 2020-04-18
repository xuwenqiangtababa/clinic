package cn.bdqn.master.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SeeType implements Serializable {
    private Integer id;

    private Integer seeId;

    private String seeTypeName;

    private static final long serialVersionUID = 1L;
}