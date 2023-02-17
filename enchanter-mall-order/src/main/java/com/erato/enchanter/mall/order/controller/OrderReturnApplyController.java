package com.erato.enchanter.mall.order.controller;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.order.entity.OrderReturnApply;
import com.erato.enchanter.mall.order.service.OrderReturnApplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderReturnApply)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-17 22:54:59
 */
@RestController
@RequestMapping("/order/orderReturnApply")
public class OrderReturnApplyController {
    /**
     * 服务对象
     */
    @Resource
    private OrderReturnApplyService orderReturnApplyService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @GetMapping("/filter")
    public ResponseEntity<PageResp<OrderReturnApply>> queryByPage(
            @RequestParam(required = false) String skuName,
            @RequestParam(required = false, defaultValue = "1") int curPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize) {
        return ResponseEntity.ok(this.orderReturnApplyService.queryByPage(skuName, curPage, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderReturnApply> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderReturnApplyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderReturnApply 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderReturnApply> add(@RequestBody OrderReturnApply orderReturnApply) {
        return ResponseEntity.ok(this.orderReturnApplyService.insert(orderReturnApply));
    }

    /**
     * 编辑数据
     *
     * @param orderReturnApply 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderReturnApply> edit(@RequestBody OrderReturnApply orderReturnApply) {
        return ResponseEntity.ok(this.orderReturnApplyService.update(orderReturnApply));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderReturnApplyService.deleteById(id));
    }

}

