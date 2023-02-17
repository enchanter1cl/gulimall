package com.erato.enchanter.mall.order.controller;

import com.erato.enchanter.mall.common.vo.CommonResp;
import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.OrderOperateHistory;
import com.erato.enchanter.mall.order.service.OrderOperateHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单操作历史记录(OrderOperateHistory)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-17 20:19:34
 */
@RestController
@RequestMapping("order/orderOperateHistory")
public class OrderOperateHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private OrderOperateHistoryService orderOperateHistoryService;

    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<OrderOperateHistory> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.orderOperateHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<OrderOperateHistory> add(@RequestBody OrderOperateHistory orderOperateHistory) {
        return CommonResp.ok(this.orderOperateHistoryService.insert(orderOperateHistory));
    }

    /**
     * 编辑数据
     *
     * @param orderOperateHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<OrderOperateHistory> edit(@RequestBody OrderOperateHistory orderOperateHistory) {
        return CommonResp.ok(this.orderOperateHistoryService.update(orderOperateHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.orderOperateHistoryService.deleteById(id));
    }

}

