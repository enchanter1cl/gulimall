package com.erato.enchanter.mall.order.service;

import com.erato.enchanter.mall.order.entity.PaymentInfo;

/**
 * (PaymentInfo)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-17 23:35:19
 */
public interface PaymentInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PaymentInfo queryById(Long id);
    

    /**
     * 新增数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    PaymentInfo insert(PaymentInfo paymentInfo);

    /**
     * 修改数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    PaymentInfo update(PaymentInfo paymentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
