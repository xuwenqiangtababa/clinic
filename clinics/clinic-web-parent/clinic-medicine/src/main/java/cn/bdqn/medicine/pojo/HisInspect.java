package cn.bdqn.medicine.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class HisInspect implements Serializable {
    private Integer id;

    /**
     * 检查名称
     */
    private String inspectName;

    /**
     * 检查类型ID
     */
    private String inspectTypeId;

    private HisInspectType hisInspectType;
    private static final long serialVersionUID = 1L;

    public static HisInspectBuilder builder() {
        return new HisInspectBuilder();
    }
}