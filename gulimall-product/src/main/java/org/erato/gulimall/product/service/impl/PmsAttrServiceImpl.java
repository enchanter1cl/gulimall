package org.erato.gulimall.product.service.impl;

import org.erato.gulimall.product.entity.PmsAttr;
import org.erato.gulimall.product.dao.PmsAttrDao;
import org.erato.gulimall.product.service.PmsAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品属性(PmsAttr)表服务实现类
 *
 * @author makejava
 * @since 2023-01-01 12:49:29
 */
@Service("pmsAttrService")
public class PmsAttrServiceImpl implements PmsAttrService {
    @Autowired
    private PmsAttrDao pmsAttrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    @Override
    public PmsAttr queryById(Long attrId) {
        return this.pmsAttrDao.queryById(attrId);
    }

    /**
     * 分页查询
     *
     * @param pmsAttr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsAttr> queryByPage(PmsAttr pmsAttr, PageRequest pageRequest) {
        long total = this.pmsAttrDao.count(pmsAttr);
        return new PageImpl<>(this.pmsAttrDao.queryAllByLimit(pmsAttr, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttr insert(PmsAttr pmsAttr) {
        this.pmsAttrDao.insert(pmsAttr);
        return pmsAttr;
    }

    /**
     * 修改数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttr update(PmsAttr pmsAttr) {
        this.pmsAttrDao.update(pmsAttr);
        return this.queryById(pmsAttr.getAttrId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrId) {
        return this.pmsAttrDao.deleteById(attrId) > 0;
    }
}
