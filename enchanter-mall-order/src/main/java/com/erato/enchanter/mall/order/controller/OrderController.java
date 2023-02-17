package com.erato.enchanter.mall.order.controller;

import com.erato.enchanter.mall.common.vo.CommonResp;
import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.Order;
import com.erato.enchanter.mall.order.service.OrderService;
import com.github.pagehelper.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单表(Order)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-16 23:17:16
 */
@RestController
@RequestMapping("order")
public class OrderController {
    
    @Resource
    private OrderService orderService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @GetMapping("/filter")
    public CommonResp<PageResp<Order>> queryByPage(
            @RequestParam(required = false) Long memberId,
            @RequestParam(required = false, defaultValue = "1") int curPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize) {
        return CommonResp.ok(this.orderService.queryByPage(memberId, curPage, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<Order> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.orderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param order 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<Order> add(@RequestBody Order order) {
        Order insertResult = this.orderService.insert(order);
        return CommonResp.ok(insertResult);
    }

    /**
     * 编辑数据
     *
     * @param order 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<Order> edit(@RequestBody Order order) {
        return CommonResp.ok(this.orderService.update(order));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.orderService.deleteById(id));
    }

}

