package com.erato.demomall.product.service;

import com.erato.demomall.product.entity.Attr;
import com.erato.demomall.common.vo.PageResp;

/**
 * 商品属性(PmsAttr)表服务接口
 *
 * @author makejava
 * @since 2023-01-01 12:49:29
 */
public interface AttrService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    Attr queryById(Long attrId);

    /**
     * 新增数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    Attr insert(Attr attr);

    /**
     * 修改数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    Attr update(Attr attr);

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    boolean deleteById(Long attrId);
    
    PageResp queryWithFilter(Attr attr, int curPage, int pageSize);
}
