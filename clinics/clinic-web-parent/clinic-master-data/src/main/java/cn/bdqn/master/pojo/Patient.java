package cn.bdqn.master.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class Patient implements Serializable {
    private Integer id;

    /**
     * 患者名称
     */
    private String patientName;

    /**
     * 患者年龄
     */
    private Integer patientAge;

    /**
     * 患者性别
     */
    private String patientSex;

    /**
     * 患者出生年月
     */
    private Date patientDate;

    /**
     * 患者证件卡号
     */
    private String patientNumber;

    private Integer patientSee;

    /**
     * 患者地址
     */
    private String patientAddress;

    /**
     * 手机号
     */
    private String patientPhone;

    private SeeType seeType;

    private static final long serialVersionUID = 1L;

    public static PatientBuilder builder() {
        return new PatientBuilder();
    }
}