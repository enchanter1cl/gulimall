package com.erato.enchanter.mall.order.service.impl;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.OrderReturnApply;
import com.erato.enchanter.mall.order.dao.OrderReturnApplyDao;
import com.erato.enchanter.mall.order.service.OrderReturnApplyService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderReturnApply)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-17 22:54:59
 */
@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl implements OrderReturnApplyService {
    @Resource
    private OrderReturnApplyDao orderReturnApplyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderReturnApply queryById(Long id) {
        return this.orderReturnApplyDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageResp<OrderReturnApply> queryByPage(String skuName, int curPage, int pageSize) {
        OrderReturnApply orderReturnApply = new OrderReturnApply();
        orderReturnApply.setSkuName(skuName);
        long total = this.orderReturnApplyDao.count(orderReturnApply);
        PageHelper.startPage(curPage, pageSize);
        List<OrderReturnApply> orderReturnApplies = this.orderReturnApplyDao.queryAllByLimit(orderReturnApply);
        PageResp<OrderReturnApply> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page)orderReturnApplies).getTotal());
        pageResp.setList(orderReturnApplies);
        return pageResp;
    }

    /**
     * 新增数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OrderReturnApply insert(OrderReturnApply orderReturnApply) {
        this.orderReturnApplyDao.insert(orderReturnApply);
        return orderReturnApply;
    }

    /**
     * 修改数据
     *
     * @param orderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OrderReturnApply update(OrderReturnApply orderReturnApply) {
        this.orderReturnApplyDao.update(orderReturnApply);
        return this.queryById(orderReturnApply.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderReturnApplyDao.deleteById(id) > 0;
    }
}
