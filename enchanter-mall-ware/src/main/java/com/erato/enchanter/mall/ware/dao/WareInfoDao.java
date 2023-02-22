package com.erato.enchanter.mall.ware.dao;

import com.erato.enchanter.mall.ware.entity.WareInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 仓库信息(WareInfo)表数据库访问层
 *
 * @author zhangyuan
 * @since 2023-02-20 16:39:29
 */
@Mapper
public interface WareInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WareInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param wareInfo 查询条件
     * @return 对象列表
     */
    List<WareInfo> queryAllByLimit(WareInfo wareInfo);

    /**
     * 统计总行数
     *
     * @param wareInfo 查询条件
     * @return 总行数
     */
    long count(WareInfo wareInfo);

    /**
     * 新增数据
     *
     * @param wareInfo 实例对象
     * @return 影响行数
     */
    int insert(WareInfo wareInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WareInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WareInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WareInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WareInfo> entities);

    /**
     * 修改数据
     *
     * @param wareInfo 实例对象
     * @return 影响行数
     */
    int update(WareInfo wareInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

