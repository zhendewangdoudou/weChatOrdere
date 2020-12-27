package com.imooc.dataobject;


import com.sun.org.glassfish.external.probe.provider.annotations.ProbeProvider;
import lombok.Data;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @Description:  ProductCategory
* @Author: wdd
* @Date: 2020/12/22
*/
@Entity
@Proxy(lazy = false)
@DynamicUpdate
@Data
public class ProductCategory {
    /**类目id*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer categoryId;
    /**类目名字*/
    private String categoryName;
    /**类目名称*/
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
