package com.erato.enchanter.mall.member.service.impl;

import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.member.entity.Member;
import com.erato.enchanter.mall.member.dao.MemberDao;
import com.erato.enchanter.mall.member.service.MemberService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 会员表(Member)表服务实现类
 *
 * @author zhangyuan
 * @since 2023-02-20 06:53:58
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Member queryById(Long id) {
        return this.memberDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageResp<Member> queryByPage(int curPage, int pageSize) {
        Member member = new Member();
        long total = this.memberDao.count(member);
        PageHelper.startPage(curPage, pageSize);
        this.memberDao.queryAllByLimit(member);
        return null;
    }

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    @Override
    public Member insert(Member member) {
        this.memberDao.insert(member);
        return member;
    }

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    @Override
    public Member update(Member member) {
        this.memberDao.update(member);
        return this.queryById(member.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.memberDao.deleteById(id) > 0;
    }
}
