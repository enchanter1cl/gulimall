package com.erato.demomall.product.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.erato.demomall.product.entity.Brand;
import com.erato.demomall.product.dao.PmsBrandDao;
import com.erato.demomall.product.service.PmsBrandService;
import org.springframework.stereotype.Service;
import com.erato.demomall.common.vo.PageResp;
import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(PmsBrand)表服务实现类
 *
 * @author makejava
 * @since 2023-02-03 23:05:11
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl implements PmsBrandService {
    @Resource
    private PmsBrandDao pmsBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Long brandId) {
        return this.pmsBrandDao.queryById(brandId);
    }
    
    /**
     * 分页查询
     *
     * @param brand 筛选条件
     * @param curPage 分页信息
     * @param pageSize 分页信息
     * @return 查询结果
     */
    @Override
    public PageResp<Brand> queryWithFilter(Brand brand, int curPage, int pageSize) {
        PageHelper.startPage(curPage, pageSize);
        List<Brand> brands = pmsBrandDao.queryWithFilter(brand);
        PageResp<Brand> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page) brands).getTotal());
        pageResp.setList(brands);
        return pageResp;
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.pmsBrandDao.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.pmsBrandDao.update(brand);
        return this.queryById(brand.getBrandId());
    }

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long brandId) {
        return this.pmsBrandDao.deleteById(brandId) > 0;
    }
}
