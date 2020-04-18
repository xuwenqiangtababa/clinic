package cn.bdqn.master.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Addition implements Serializable {
    private Integer id;

    private String dosage;

    private Integer number;

    private Double price;

    private static final long serialVersionUID = 1L;
}