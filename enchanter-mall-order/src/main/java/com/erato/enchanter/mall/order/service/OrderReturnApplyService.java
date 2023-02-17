package com.erato.enchanter.mall.order.service;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.OrderReturnApply;

/**
 * (OrderReturnApply)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-17 22:54:59
 */
public interface OrderReturnApplyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderReturnApply queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResp<OrderReturnApply> queryByPage(String skuName, int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    OrderReturnApply insert(OrderReturnApply orderReturnApply);

    /**
     * 修改数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    OrderReturnApply update(OrderReturnApply orderReturnApply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
