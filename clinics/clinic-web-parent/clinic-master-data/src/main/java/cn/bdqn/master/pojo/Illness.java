package cn.bdqn.master.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Illness implements Serializable {
    private Integer id;

    /**
     * 疾病名称
     */
    private String illnessName;

    private static final long serialVersionUID = 1L;
}