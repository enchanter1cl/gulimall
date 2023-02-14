package com.erato.demomall.product.controller;

import com.erato.demomall.common.validation.OnAdd;
import com.erato.demomall.common.validation.OnUpdate;
import com.erato.demomall.product.entity.Brand;
import com.erato.demomall.product.service.BrandService;
import com.erato.demomall.common.vo.CommonResp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.erato.demomall.common.vo.PageResp;
import javax.annotation.Resource;

/**
 * 品牌(PmsBrand)表控制层
 *
 * @author zhangyuan
 * @since 2021-02-03 23:05:10
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    
    @Resource
    private BrandService brandService;

//    /**
//     * 分页查询
//     *
//     * @param pmsBrand 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public CommonResp<Page<PmsBrand>> queryByPage(PmsBrand pmsBrand, PageRequest pageRequest) {
//        return CommonResp.ok(this.pmsBrandService.queryByPage(pmsBrand, pageRequest));
//    }
    
    @GetMapping("/filter")
    public CommonResp<PageResp> queryWithFilter(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String firstLetter,
            @RequestParam(required = false) Integer sort,
            @RequestParam(required = false, defaultValue = "1") int curPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize) {
    
        Brand brand = new Brand();
        brand.setName(name);
        brand.setFirstLetter(firstLetter);
        brand.setSort(sort);
        return CommonResp.ok(brandService.queryWithFilter(brand, curPage, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<Brand> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.brandService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param brand 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<Brand> add(@Validated(OnAdd.class) @RequestBody Brand brand) {
        return CommonResp.ok(this.brandService.insert(brand));
    }

    /**
     * 编辑数据
     *
     * @param brand 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<Brand> edit(@Validated(OnUpdate.class) @RequestBody Brand brand) {
        return CommonResp.ok(this.brandService.update(brand));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.brandService.deleteById(id));
    }

}

