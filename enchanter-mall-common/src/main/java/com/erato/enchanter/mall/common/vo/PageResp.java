package com.erato.enchanter.mall.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @author ZhangYuan
 * @date 2023/2/13
 */

@Data
public class PageResp<T> {
    
    private Long total;
    
    private Integer curPage;
    
    private Integer pageSize;
    
    private List<T> list;
}
