package org.erato.gulimall.product.entity;

import com.erato.demomall.common.validation.OnAdd;
import com.erato.demomall.common.validation.OnUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌(PmsBrand)实体类
 *
 * @author zhangyuan
 * @since 2021-02-03 23:05:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand implements Serializable {
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
    @NotBlank(message = "'name' should not be blank",groups = {OnAdd.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank(groups = {OnAdd.class})
    @URL(message = "'logo' must be an url",groups={OnAdd.class,OnUpdate.class})
    private String logo;
    /**
     * 介绍
     */
    private String description;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = {OnAdd.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty(groups = OnAdd.class)
    @Pattern(regexp="^[a-zA-Z]$",message = "'firstLetter' must be a letter")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups = OnAdd.class)
    @Min(value = 0,message = "'sort' >= 0", groups = {OnAdd.class, OnUpdate.class})
    private Integer sort;
}

