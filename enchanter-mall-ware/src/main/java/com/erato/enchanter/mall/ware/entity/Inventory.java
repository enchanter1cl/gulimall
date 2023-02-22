package com.erato.enchanter.mall.ware.entity;

import java.io.Serializable;

/**
 * 商品库存(Inventory)实体类
 *
 * @author zhangyuan
 * @since 2023-02-22 14:05:09
 */
public class Inventory implements Serializable {
    private static final long serialVersionUID = -81502567727801440L;
    /**
     * id
     */
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 库存数
     */
    private Integer stock;
    /**
     * sku_name
     */
    private String skuName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

}

