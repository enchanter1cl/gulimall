package com.erato.enchanter.mall.member.controller;

import com.erato.enchanter.mall.common.vo.CommonResp;
import com.erato.enchanter.mall.common.vo.PageResp;
import com.erato.enchanter.mall.member.entity.Member;
import com.erato.enchanter.mall.member.service.MemberService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * 会员表(Member)表控制层
 *
 * @author zhangyuan
 * @since 2023-02-20 06:53:58
 */
@RestController
@RequestMapping("member")
public class MemberController {
    /**
     * 服务对象
     */
    @Resource
    private MemberService memberService;

//    /**
//     * 分页查询
//     *
//     * @return 查询结果
//     */
//    @GetMapping
//    public CommonResp<PageResp<Member>> queryByPage(
//            @RequestParam(required = false, defaultValue = "1") int curPage,
//            @RequestParam(required = false, defaultValue = "5") int pageSize) {
//        return CommonResp.ok(this.memberService.queryByPage(curPage, pageSize));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public CommonResp<Member> queryById(@PathVariable("id") Long id) {
        return CommonResp.ok(this.memberService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param member 实体
     * @return 新增结果
     */
    @PostMapping
    public CommonResp<Member> add(@RequestBody Member member) {
        return CommonResp.ok(this.memberService.insert(member));
    }

    /**
     * 编辑数据
     *
     * @param member 实体
     * @return 编辑结果
     */
    @PutMapping
    public CommonResp<Member> edit(@RequestBody Member member) {
        return CommonResp.ok(this.memberService.update(member));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public CommonResp<Boolean> deleteById(Long id) {
        return CommonResp.ok(this.memberService.deleteById(id));
    }

}

