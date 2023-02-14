package com.erato.demomall.product.controller;

import com.erato.demomall.product.entity.Attr;
import com.erato.demomall.product.service.PmsAttrService;
import org.springframework.web.bind.annotation.*;
import vo.CommonResp;
import vo.PageResp;
import javax.annotation.Resource;

/**
 * 商品属性(PmsAttr)表控制层
 *
 *
 * @author zhangyuan
 * @since 2021-01-01 12:49:21
 */
@RestController
@RequestMapping("product/attr")
public class PmsAttrController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrService pmsAttrService;

//    /**
//     * 分页查询
//     *
//     * @param pmsAttr 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public CommonResp<Page<PmsAttr>> queryByPage(PmsAttr pmsAttr, PageRequest pageRequest) {
//        return CommonResp.ok(this.pmsAttrService.queryByPage(pmsAttr, pageRequest));
//    }
    
    @GetMapping("/filter")
    public CommonResp<PageResp> queryWithFilter(
            @RequestParam(required = false) String attrName,
            @RequestParam(required = false) Integer attrType,
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false, defaultValue = "1") int curPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize
    ) {
    
        Attr attr = new Attr();
        attr.setAttrName(attrName);
        attr.setAttrType(attrType);
        attr.setCategoryId(categoryId);
        return CommonResp.ok(pmsAttrService.queryWithFilter(attr, curPage, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<Attr> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.pmsAttrService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param attr 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<Attr> add(Attr attr) {
        return CommonResp.ok(this.pmsAttrService.insert(attr));
    }

    /**
     * 编辑数据
     *
     * @param attr 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<Attr> edit(Attr attr) {
        return CommonResp.ok(this.pmsAttrService.update(attr));
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

