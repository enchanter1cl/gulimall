package com.erato.enchanter.mall.ware.controller;

import com.erato.enchanter.mall.common.vo.CommonResp;
import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.ware.entity.WareInfo;
import com.erato.enchanter.mall.ware.service.WareInfoService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * 仓库信息(WareInfo)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-20 16:39:29
 */
@RestController
@RequestMapping("ware/wareInfo")
public class WareInfoController {
    /**
     * 服务对象
     */
    @Resource
    private WareInfoService wareInfoService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @GetMapping("filter")
    public CommonResp<PageResp<WareInfo>> queryByPage(
            @RequestParam(required = false, defaultValue = "1") int curPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize) {
        return CommonResp.ok(this.wareInfoService.queryByPage(curPage, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<WareInfo> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.wareInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wareInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<WareInfo> add(@RequestBody WareInfo wareInfo) {
        return CommonResp.ok(this.wareInfoService.insert(wareInfo));
    }

    /**
     * 编辑数据
     *
     * @param wareInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<WareInfo> edit(@RequestBody WareInfo wareInfo) {
        return CommonResp.ok(this.wareInfoService.update(wareInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.wareInfoService.deleteById(id));
    }

}

