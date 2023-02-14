package com.erato.demomall.product.service.impl;

import com.erato.demomall.product.dao.AttrDao;
import com.erato.demomall.product.entity.Attr;
import com.erato.demomall.product.service.AttrService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erato.demomall.common.vo.PageResp;

import java.util.List;

/**
 * 商品属性(PmsAttr)表服务实现类
 *
 * @author makejava
 * @since 2023-01-01 12:49:29
 */
@Service("pmsAttrService")
public class AttrServiceImpl implements AttrService {
    @Autowired
    private AttrDao attrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    @Override
    public Attr queryById(Long attrId) {
        return this.attrDao.queryById(attrId);
    }

    /**
     * 新增数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    @Override
    public Attr insert(Attr attr) {
        this.attrDao.insert(attr);
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
        this.attrDao.update(attr);
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
        return this.attrDao.deleteById(attrId) > 0;
    }
    
    @Override
    public PageResp queryWithFilter(Attr attr, int curPage, int pageSize) {
        PageHelper.startPage(curPage, pageSize);
        List<Attr> attrs = attrDao.queryWithFilter(attr);
    
        PageResp<Attr> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page) attrs).getTotal());
        pageResp.setList(attrs);
        return pageResp;
    }
}
