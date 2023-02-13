package org.erato.gulimall.product.service.impl;

import org.erato.gulimall.product.entity.Attr;
import org.erato.gulimall.product.dao.PmsAttrDao;
import org.erato.gulimall.product.service.PmsAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

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
    public Attr queryById(Long attrId) {
        return this.pmsAttrDao.queryById(attrId);
    }

    /**
     * 分页查询
     *
     * @param attr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Attr> queryByPage(Attr attr, PageRequest pageRequest) {
        long total = this.pmsAttrDao.count(attr);
        return new PageImpl<>(this.pmsAttrDao.queryAllByLimit(attr, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    @Override
    public Attr insert(Attr attr) {
        this.pmsAttrDao.insert(attr);
        return attr;
    }

    /**
     * 修改数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    @Override
    public Attr update(Attr attr) {
        this.pmsAttrDao.update(attr);
        return this.queryById(attr.getAttrId());
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
