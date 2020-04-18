package cn.bdqn.medicine.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class HisMedicineType implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}