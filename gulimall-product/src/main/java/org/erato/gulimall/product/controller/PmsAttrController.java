package org.erato.gulimall.product.controller;

import org.erato.gulimall.product.entity.PmsAttr;
import org.erato.gulimall.product.service.PmsAttrService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import vo.CommonResp;

import javax.annotation.Resource;

/**
 * 商品属性(PmsAttr)表控制层
 *
 * @author zhangyuan
 * @since 2021-01-01 12:49:21
 */
@RestController
@RequestMapping("product/pmsAttr")
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
    public CommonResp<Page<PmsAttr>> queryByPage(PmsAttr pmsAttr, PageRequest pageRequest) {
        return CommonResp.ok(this.pmsAttrService.queryByPage(pmsAttr, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<PmsAttr> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.pmsAttrService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsAttr 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<PmsAttr> add(PmsAttr pmsAttr) {
        return CommonResp.ok(this.pmsAttrService.insert(pmsAttr));
    }

    /**
     * 编辑数据
     *
     * @param pmsAttr 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<PmsAttr> edit(PmsAttr pmsAttr) {
        return CommonResp.ok(this.pmsAttrService.update(pmsAttr));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.pmsAttrService.deleteById(id));
    }

}

