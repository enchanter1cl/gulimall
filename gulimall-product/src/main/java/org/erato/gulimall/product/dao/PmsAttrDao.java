package org.erato.gulimall.product.dao;

import org.apache.ibatis.annotations.Mapper;
import org.erato.gulimall.product.entity.Attr;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品属性(PmsAttr)表数据库访问层
 *
 * @author zhangyuan
 * @since 2021-01-01 12:49:21
 */
@Mapper
public interface PmsAttrDao {

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    Attr queryById(Long attrId);

    /**
     * 统计总行数
     *
     * @param attr 查询条件
     * @return 总行数
     */
    long count(Attr attr);

    /**
     * 新增数据
     *
     * @param attr 实例对象
     * @return 影响行数
     */
    int insert(Attr attr);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsAttr> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Attr> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsAttr> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Attr> entities);

    /**
     * 修改数据
     *
     * @param attr 实例对象
     * @return 影响行数
     */
    int update(Attr attr);

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 影响行数
     */
    int deleteById(Long attrId);
    
    /**
     * query with filter (multiple conditions)
     * @param attr
     * @return query result
     */
    List<Attr> queryWithFilter(Attr attr);
}

