package com.erato.enchanter.mall.product.service;

import com.erato.enchanter.mall.product.entity.Brand;
import com.erato.enchanter.mall.common.vo.PageResp;

/**
 * 品牌(PmsBrand)表服务接口
 *
 * @author makejava
 * @since 2023-02-03 23:05:11
 */
public interface BrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand queryById(Long brandId);

    /**
     * 分页查询
     *
     * @param brand 筛选条件
     * @param
     * @pagesize
     * @return 查询结果
     */
    PageResp<Brand> queryWithFilter(Brand brand, int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    boolean deleteById(Long brandId);
}
