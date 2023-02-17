package com.erato.enchanter.mall.order.service.impl;

import com.erato.enchanter.mall.order.entity.PaymentInfo;
import com.erato.enchanter.mall.order.dao.PaymentInfoDao;
import com.erato.enchanter.mall.order.service.PaymentInfoService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (PaymentInfo)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-17 23:35:19
 */
@Service("paymentInfoService")
public class PaymentInfoServiceImpl implements PaymentInfoService {
    @Resource
    private PaymentInfoDao paymentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PaymentInfo queryById(Long id) {
        return this.paymentInfoDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PaymentInfo insert(PaymentInfo paymentInfo) {
        this.paymentInfoDao.insert(paymentInfo);
        return paymentInfo;
    }

    /**
     * 修改数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PaymentInfo update(PaymentInfo paymentInfo) {
        this.paymentInfoDao.update(paymentInfo);
        return this.queryById(paymentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.paymentInfoDao.deleteById(id) > 0;
    }
}
