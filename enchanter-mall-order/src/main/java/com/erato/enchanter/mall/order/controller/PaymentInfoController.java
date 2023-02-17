package com.erato.enchanter.mall.order.controller;

import com.erato.enchanter.mall.order.entity.PaymentInfo;
import com.erato.enchanter.mall.order.service.PaymentInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PaymentInfo)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-17 23:35:19
 */
@RestController
@RequestMapping("/order/paymentInfo")
public class PaymentInfoController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentInfoService paymentInfoService;
    

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PaymentInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.paymentInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param paymentInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PaymentInfo> add(@RequestBody PaymentInfo paymentInfo) {
        return ResponseEntity.ok(this.paymentInfoService.insert(paymentInfo));
    }

    /**
     * 编辑数据
     *
     * @param paymentInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PaymentInfo> edit(@RequestBody PaymentInfo paymentInfo) {
        return ResponseEntity.ok(this.paymentInfoService.update(paymentInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.paymentInfoService.deleteById(id));
    }

}

