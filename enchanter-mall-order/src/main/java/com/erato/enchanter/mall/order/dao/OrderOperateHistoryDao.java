package com.erato.enchanter.mall.order.dao;

import com.erato.enchanter.mall.order.entity.OrderOperateHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单操作历史记录(OrderOperateHistory)表数据库访问层
 *
 * @author zhangyuan
 * @since 2023-02-17 20:19:35
 */

@Mapper
public interface OrderOperateHistoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderOperateHistory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param orderOperateHistory 查询条件
     * @return 对象列表
     */
    List<OrderOperateHistory> queryAllByLimit(OrderOperateHistory orderOperateHistory);

    /**
     * 统计总行数
     *
     * @param orderOperateHistory 查询条件
     * @return 总行数
     */
    long count(OrderOperateHistory orderOperateHistory);

    /**
     * 新增数据
     *
     * @param orderOperateHistory 实例对象
     * @return 影响行数
     */
    int insert(OrderOperateHistory orderOperateHistory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderOperateHistory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderOperateHistory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderOperateHistory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderOperateHistory> entities);

    /**
     * 修改数据
     *
     * @param orderOperateHistory 实例对象
     * @return 影响行数
     */
    int update(OrderOperateHistory orderOperateHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

