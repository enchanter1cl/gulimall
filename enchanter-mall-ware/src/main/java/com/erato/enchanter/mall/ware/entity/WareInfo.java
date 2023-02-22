package com.erato.enchanter.mall.ware.entity;

import java.io.Serializable;

/**
 * 仓库信息(WareInfo)实体类
 *
 * @author zhangyuan
 * @since 2023-02-20 16:39:29
 */
public class WareInfo implements Serializable {
    private static final long serialVersionUID = -46002659999459748L;
    /**
     * id
     */
    private Long id;
    /**
     * 仓库名
     */
    private String name;
    /**
     * 仓库地址
     */
    private String address;
    /**
     * 区域编码
     */
    private String areacode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}

