package com.erato.enchanter.mall.order.service;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.Order;

/**
 * 订单表(Order)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-16 23:17:16
 */
public interface OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Order queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResp<Order> queryByPage(int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
