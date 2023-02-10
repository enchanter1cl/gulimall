package org.erato.gulimall.product.entity;

import com.erato.demomall.common.validation.OnAdd;
import com.erato.demomall.common.validation.OnUpdate;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌(PmsBrand)实体类
 *
 * @author makejava
 * @since 2023-02-03 23:05:10
 */
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = 555918085232959157L;
    /**
     * 品牌id
     */
    @NotNull(message = "'brandId' is required on UPDATE",groups = OnUpdate.class)
    @Null(message = "'brandId' should be absent on ADD",groups = OnAdd.class)
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "'name' should not be blank",groups = {OnAdd.class, OnUpdate.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank(groups = {OnAdd.class, OnUpdate.class})
    @URL(message = "'logo' must be an url",groups={OnAdd.class,OnUpdate.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = {OnAdd.class, OnUpdate.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty(groups = OnAdd.class)
    @Pattern(regexp="^[a-zA-Z]$",message = "'firstLetter must be a letter'")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups = OnAdd.class)
    @Min(value = 0,message = "'sort' >= 0", groups = {OnAdd.class, OnUpdate.class})
    private Integer sort;


    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}

