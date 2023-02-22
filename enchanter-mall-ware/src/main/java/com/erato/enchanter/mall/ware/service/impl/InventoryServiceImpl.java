package com.erato.enchanter.mall.ware.service.impl;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.ware.entity.Inventory;
import com.erato.enchanter.mall.ware.dao.InventoryDao;
import com.erato.enchanter.mall.ware.service.InventoryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 商品库存(Inventory)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-22 14:05:09
 */
@Service("inventoryService")
public class InventoryServiceImpl implements InventoryService {
    @Resource
    private InventoryDao inventoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Inventory queryById(Long id) {
        return this.inventoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageResp<Inventory> queryByPage(String skuName, int curPage, int pageSize) {
        Inventory inventory = new Inventory();
        inventory.setSkuName(skuName);
        long total = this.inventoryDao.count(inventory);
        PageHelper.startPage(curPage, pageSize);
        List<Inventory> inventories = this.inventoryDao.queryAllByLimit(inventory);
        PageResp<Inventory> pageResp = new PageResp<>();
        pageResp.setCurPage(curPage);
        pageResp.setPageSize(pageSize);
        pageResp.setTotal(((Page)inventories).getTotal());
        pageResp.setList(inventories);
        return pageResp;
    }

    /**
     * 新增数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    @Override
    public Inventory insert(Inventory inventory) {
        this.inventoryDao.insert(inventory);
        return inventory;
    }

    /**
     * 修改数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    @Override
    public Inventory update(Inventory inventory) {
        this.inventoryDao.update(inventory);
        return this.queryById(inventory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.inventoryDao.deleteById(id) > 0;
    }
}
