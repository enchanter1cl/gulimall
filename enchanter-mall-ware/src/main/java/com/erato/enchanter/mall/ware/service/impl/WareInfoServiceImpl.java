package com.erato.enchanter.mall.ware.service.impl;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.ware.entity.WareInfo;
import com.erato.enchanter.mall.ware.dao.WareInfoDao;
import com.erato.enchanter.mall.ware.service.WareInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 仓库信息(WareInfo)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-20 16:39:29
 */
@Service("wareInfoService")
public class WareInfoServiceImpl implements WareInfoService {
    @Resource
    private WareInfoDao wareInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WareInfo queryById(Long id) {
        return this.wareInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageResp<WareInfo> queryByPage(int curPage, int pageSize) {
        WareInfo wareInfo = new WareInfo();
        PageHelper.startPage(curPage, pageSize);
        List<WareInfo> wareInfos = this.wareInfoDao.queryAllByLimit(wareInfo);
        long total = this.wareInfoDao.count(wareInfo);
        PageResp<WareInfo> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page)wareInfos).getTotal());
        pageResp.setList(wareInfos);
        return pageResp;
    }

    /**
     * 新增数据
     *
     * @param wareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WareInfo insert(WareInfo wareInfo) {
        this.wareInfoDao.insert(wareInfo);
        return wareInfo;
    }

    /**
     * 修改数据
     *
     * @param wareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WareInfo update(WareInfo wareInfo) {
        this.wareInfoDao.update(wareInfo);
        return this.queryById(wareInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wareInfoDao.deleteById(id) > 0;
    }
}
