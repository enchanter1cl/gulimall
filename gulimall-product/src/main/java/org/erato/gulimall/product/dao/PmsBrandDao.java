package org.erato.gulimall.product.dao;

import org.apache.ibatis.annotations.Mapper;
import org.erato.gulimall.product.entity.PmsBrand;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 品牌(PmsBrand)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-03 23:05:10
 */
@Mapper
public interface PmsBrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    PmsBrand queryById(Long brandId);

    /**
     * 查询指定行数据
     *
     * @param pmsBrand 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsBrand> queryAllByLimit(PmsBrand pmsBrand, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsBrand 查询条件
     * @return 总行数
     */
    long count(PmsBrand pmsBrand);

    /**
     * 新增数据
     *
     * @param pmsBrand 实例对象
     * @return 影响行数
     */
    int insert(PmsBrand pmsBrand);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsBrand> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsBrand> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsBrand> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsBrand> entities);

    /**
     * 修改数据
     *
     * @param pmsBrand 实例对象
     * @return 影响行数
     */
    int update(PmsBrand pmsBrand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 影响行数
     */
    int deleteById(Long brandId);

}

