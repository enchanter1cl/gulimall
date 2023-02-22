package com.erato.enchanter.mall.ware.controller;

import com.erato.enchanter.mall.common.vo.CommonResp;
import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.ware.entity.Inventory;
import com.erato.enchanter.mall.ware.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * 商品库存(Inventory)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-22 14:05:09
 */
@RestController
@RequestMapping("ware/inventory")
public class InventoryController {
    /**
     * 服务对象
     */
    @Resource
    private InventoryService inventoryService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @GetMapping("/filter")
    public CommonResp<PageResp<Inventory>> queryByPage(@RequestParam(required = false) String skuName, @RequestParam(required = false, defaultValue = "1") int curPage, @RequestParam(required = false, defaultValue = "5") int pageSize) {
        return CommonResp.ok(this.inventoryService.queryByPage(skuName, curPage, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<Inventory> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.inventoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param inventory 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<Inventory> add(@RequestBody Inventory inventory) {
        return CommonResp.ok(this.inventoryService.insert(inventory));
    }

    /**
     * 编辑数据
     *
     * @param inventory 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<Inventory> edit(@RequestBody Inventory inventory) {
        return CommonResp.ok(this.inventoryService.update(inventory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.inventoryService.deleteById(id));
    }

}

