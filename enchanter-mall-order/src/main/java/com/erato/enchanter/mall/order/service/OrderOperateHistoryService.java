package com.erato.enchanter.mall.order.service;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.OrderOperateHistory;

/**
 * 订单操作历史记录(OrderOperateHistory)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-17 20:19:35
 */
public interface OrderOperateHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderOperateHistory queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderOperateHistory 筛选条件
     * @return 查询结果
     */
    PageResp<OrderOperateHistory> queryByPage(OrderOperateHistory orderOperateHistory, int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    OrderOperateHistory insert(OrderOperateHistory orderOperateHistory);

    /**
     * 修改数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    OrderOperateHistory update(OrderOperateHistory orderOperateHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
