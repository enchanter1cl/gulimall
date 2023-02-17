package com.erato.enchanter.mall.order.service.impl;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.OrderOperateHistory;
import com.erato.enchanter.mall.order.dao.OrderOperateHistoryDao;
import com.erato.enchanter.mall.order.service.OrderOperateHistoryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 订单操作历史记录(OrderOperateHistory)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-17 20:19:35
 */
@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl implements OrderOperateHistoryService {
    @Resource
    private OrderOperateHistoryDao orderOperateHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderOperateHistory queryById(Long id) {
        return this.orderOperateHistoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderOperateHistory 筛选条件
     * @return 查询结果
     */
    @Override
    public PageResp<OrderOperateHistory> queryByPage(OrderOperateHistory orderOperateHistory, int curPage, int pageSize) {
        long total = this.orderOperateHistoryDao.count(orderOperateHistory);
        PageHelper.startPage(curPage, pageSize);
        List<OrderOperateHistory> orderOperateHistories = this.orderOperateHistoryDao.queryAllByLimit(orderOperateHistory);
        PageResp<OrderOperateHistory> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page) orderOperateHistories).getTotal());
        pageResp.setList(orderOperateHistories);
        return pageResp;
    }

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OrderOperateHistory insert(OrderOperateHistory orderOperateHistory) {
        this.orderOperateHistoryDao.insert(orderOperateHistory);
        return orderOperateHistory;
    }

    /**
     * 修改数据
     *
     * @param orderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OrderOperateHistory update(OrderOperateHistory orderOperateHistory) {
        this.orderOperateHistoryDao.update(orderOperateHistory);
        return this.queryById(orderOperateHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderOperateHistoryDao.deleteById(id) > 0;
    }
}
