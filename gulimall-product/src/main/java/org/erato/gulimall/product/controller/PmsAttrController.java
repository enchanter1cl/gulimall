package org.erato.gulimall.product.controller;

import org.erato.gulimall.product.entity.PmsAttr;
import org.erato.gulimall.product.service.PmsAttrService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品属性(PmsAttr)表控制层
 *
 * @author makejava
 * @since 2023-01-01 12:49:21
 */
@RestController
@RequestMapping("pmsAttr")
public class PmsAttrController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrService pmsAttrService;

    /**
     * 分页查询
     *
     * @param pmsAttr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsAttr>> queryByPage(PmsAttr pmsAttr, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsAttrService.queryByPage(pmsAttr, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsAttr> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsAttrService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsAttr 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsAttr> add(PmsAttr pmsAttr) {
        return ResponseEntity.ok(this.pmsAttrService.insert(pmsAttr));
    }

    /**
     * 编辑数据
     *
     * @param pmsAttr 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsAttr> edit(PmsAttr pmsAttr) {
        return ResponseEntity.ok(this.pmsAttrService.update(pmsAttr));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsAttrService.deleteById(id));
    }

}

