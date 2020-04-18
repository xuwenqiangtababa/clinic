package cn.bdqn.medicine.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class HisInspectType implements Serializable {
    private Integer id;

    /**
     * 检查类型名称
     */
    private String inspectTypeName;

    private static final long serialVersionUID = 1L;

    public static HisInspectTypeBuilder builder() {
        return new HisInspectTypeBuilder();
    }
}