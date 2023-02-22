package com.erato.enchanter.mall.ware.service;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.ware.entity.Inventory;

/**
 * 商品库存(Inventory)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-22 14:05:09
 */
public interface InventoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Inventory queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResp<Inventory> queryByPage(String skuName, int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    Inventory insert(Inventory inventory);

    /**
     * 修改数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    Inventory update(Inventory inventory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
