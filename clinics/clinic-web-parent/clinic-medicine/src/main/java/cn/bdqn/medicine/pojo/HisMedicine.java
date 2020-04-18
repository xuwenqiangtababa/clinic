package cn.bdqn.medicine.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class HisMedicine implements Serializable {
    private Long id;

    private Integer typeId;

    /**
    * 药品编码
    */
    private String code;

    /**
    * 条码
    */
    private String barcode;

    private String name;

    private String spec;

    private String stock;

    /**
    * 是否otc药品
    */
    private String otc;

    /**
    * 成本价
    */
    private Integer costPrice;

    /**
    * 销售价
    */
    private Integer salePrice;

    private String factory;



    /**
     * 药品类型
     */
    private HisMedicineType hisMedicineType;

    private static final long serialVersionUID = 1L;
}