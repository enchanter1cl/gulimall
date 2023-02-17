package com.erato.enchanter.mall.order.dao;

import com.erato.enchanter.mall.order.entity.OrderReturnApply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OrderReturnApply)表数据库访问层
 *
 * @author zhangyuan
 * @since 2023-02-17 22:54:59
 */
@Mapper
public interface OrderReturnApplyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderReturnApply queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param orderReturnApply 查询条件
     * @return 对象列表
     */
    List<OrderReturnApply> queryAllByLimit(OrderReturnApply orderReturnApply);

    /**
     * 统计总行数
     *
     * @param orderReturnApply 查询条件
     * @return 总行数
     */
    long count(OrderReturnApply orderReturnApply);

    /**
     * 新增数据
     *
     * @param orderReturnApply 实例对象
     * @return 影响行数
     */
    int insert(OrderReturnApply orderReturnApply);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderReturnApply> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderReturnApply> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderReturnApply> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderReturnApply> entities);

    /**
     * 修改数据
     *
     * @param orderReturnApply 实例对象
     * @return 影响行数
     */
    int update(OrderReturnApply orderReturnApply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

