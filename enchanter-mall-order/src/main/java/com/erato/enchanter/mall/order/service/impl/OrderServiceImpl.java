package com.erato.enchanter.mall.order.service.impl;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.Order;
import com.erato.enchanter.mall.order.dao.OrderDao;
import com.erato.enchanter.mall.order.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 订单表(Order)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-16 23:17:16
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Long id) {
        return this.orderDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageResp<Order> queryByPage(int curPage, int pageSize) {
        PageHelper.startPage(curPage, pageSize);
        long total = this.orderDao.count(new Order());
        List<Order> orders = this.orderDao.queryAllByLimit(new Order());
        PageResp<Order> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page) orders).getTotal());
        pageResp.setList(orders);
        return pageResp;
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order insert(Order order) {
        this.orderDao.insert(order);
        return order;
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderDao.update(order);
        return this.queryById(order.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderDao.deleteById(id) > 0;
    }
}
