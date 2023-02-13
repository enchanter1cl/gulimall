package org.erato.gulimall.product.service;

import org.erato.gulimall.product.entity.Attr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品属性(PmsAttr)表服务接口
 *
 * @author makejava
 * @since 2023-01-01 12:49:29
 */
public interface PmsAttrService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    Attr queryById(Long attrId);

    /**
     * 分页查询
     *
     * @param attr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Attr> queryByPage(Attr attr, PageRequest pageRequest);

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

}
