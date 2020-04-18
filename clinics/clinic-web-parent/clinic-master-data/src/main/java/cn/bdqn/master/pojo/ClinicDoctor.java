package cn.bdqn.master.pojo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClinicDoctor implements Serializable {
    private Integer id;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 科室
     */
    private String section;

    private static final long serialVersionUID = 1L;
}