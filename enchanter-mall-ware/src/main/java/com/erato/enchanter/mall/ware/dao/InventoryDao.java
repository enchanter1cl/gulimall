package com.erato.enchanter.mall.ware.dao;

import com.erato.enchanter.mall.ware.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品库存(Inventory)表数据库访问层
 *
 * @author zhangyuan
 * @since 2023-02-22 14:05:09
 */
@Mapper
public interface InventoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Inventory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param inventory 查询条件
     * @return 对象列表
     */
    List<Inventory> queryAllByLimit(Inventory inventory);

    /**
     * 统计总行数
     *
     * @param inventory 查询条件
     * @return 总行数
     */
    long count(Inventory inventory);

    /**
     * 新增数据
     *
     * @param inventory 实例对象
     * @return 影响行数
     */
    int insert(Inventory inventory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Inventory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Inventory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Inventory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Inventory> entities);

    /**
     * 修改数据
     *
     * @param inventory 实例对象
     * @return 影响行数
     */
    int update(Inventory inventory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

