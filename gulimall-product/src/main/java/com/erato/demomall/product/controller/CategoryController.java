package com.erato.demomall.product.controller;

import com.erato.demomall.product.entity.Category;
import com.erato.demomall.product.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.erato.demomall.common.vo.CommonResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品三级分类(Category)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-14 13:06:23
 */
@RestController
@RequestMapping("category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;
    
    /**
     * 3-level catalog of product category. Listed with structure of a tree.
     * @return All categories listed with structure of a tree.
     */
    @GetMapping("/list/tree")
    public CommonResp queryAll() {
        return CommonResp.ok(this.categoryService.listWithTree());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<Category> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.categoryService.queryById(id));
    }
    
    /**
     * 新增数据
     *
     * @param category 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<Category> add(Category category) {
        return CommonResp.ok(this.categoryService.insert(category));
    }
    
    /**
     * 编辑数据
     *
     * @param category 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<Category> edit(Category category) {
        return CommonResp.ok(this.categoryService.update(category));
    }
    
    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.categoryService.deleteById(id));
    }
    
}

