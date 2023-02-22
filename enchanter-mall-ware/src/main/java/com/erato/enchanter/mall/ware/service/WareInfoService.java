package com.erato.enchanter.mall.ware.service;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.ware.entity.WareInfo;

/**
 * 仓库信息(WareInfo)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-20 16:39:29
 */
public interface WareInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WareInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResp<WareInfo> queryByPage(int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param wareInfo 实例对象
     * @return 实例对象
     */
    WareInfo insert(WareInfo wareInfo);

    /**
     * 修改数据
     *
     * @param wareInfo 实例对象
     * @return 实例对象
     */
    WareInfo update(WareInfo wareInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
