package com.erato.enchanter.mall.product.entity;

import java.io.Serializable;

/**
 * 商品三级分类(Category)实体类
 *
 * @author zhangyuan
 * @since 2023-02-14 13:06:23
 */
public class Category implements Serializable {
    private static final long serialVersionUID = -48236526149311825L;
    /**
     * 分类id
     */
    private Long catId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 父分类id
     */
    private Long parentCid;
    /**
     * 层级
     */
    private Integer catLevel;
    /**
     * 是否显示[0-不显示，1显示]
     */
    private Integer showStatus;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 图标地址
     */
    private String icon;
    /**
     * 计量单位
     */
    private String productUnit;
    /**
     * 商品数量
     */
    private Integer productCount;
    
    
    public Long getCatId() {
        return catId;
    }
    
    public void setCatId(Long catId) {
        this.catId = catId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Long getParentCid() {
        return parentCid;
    }
    
    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }
    
    public Integer getCatLevel() {
        return catLevel;
    }
    
    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }
    
    public Integer getShowStatus() {
        return showStatus;
    }
    
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
    
    public Integer getSort() {
        return sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    
    public String getIcon() {
        return icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public String getProductUnit() {
        return productUnit;
    }
    
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }
    
    public Integer getProductCount() {
        return productCount;
    }
    
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
    
}

