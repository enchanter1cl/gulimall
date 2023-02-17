package com.erato.enchanter.mall.order.dao;

import com.erato.enchanter.mall.order.entity.PaymentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PaymentInfo)表数据库访问层
 *
 * @author zhangyuan
 * @since 2023-02-17 23:35:19
 */

@Mapper
public interface PaymentInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PaymentInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param paymentInfo 查询条件
     * @return 对象列表
     */
    List<PaymentInfo> queryAllByLimit(PaymentInfo paymentInfo);

    /**
     * 统计总行数
     *
     * @param paymentInfo 查询条件
     * @return 总行数
     */
    long count(PaymentInfo paymentInfo);

    /**
     * 新增数据
     *
     * @param paymentInfo 实例对象
     * @return 影响行数
     */
    int insert(PaymentInfo paymentInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PaymentInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PaymentInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PaymentInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PaymentInfo> entities);

    /**
     * 修改数据
     *
     * @param paymentInfo 实例对象
     * @return 影响行数
     */
    int update(PaymentInfo paymentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

