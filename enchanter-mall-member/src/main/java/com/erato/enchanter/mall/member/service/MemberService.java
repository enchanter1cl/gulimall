package com.erato.enchanter.mall.member.service;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.member.entity.Member;

/**
 * 会员表(Member)表服务接口
 *
 * @author zhangyuan
 * @since 2023-02-20 06:53:58
 */
public interface MemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Member queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResp<Member> queryByPage(int curPage, int pageSize);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
