package cn.sz.twoOfGroup.controller;

import cn.sz.twoOfGroup.entity.StsUser;
import cn.sz.twoOfGroup.service.StsUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (StsUser)表控制层
 *
 * @author makejava
 * @since 2020-09-01 10:18:43
 */
@RestController
@RequestMapping("stsUser")
public class StsUserController {
    /**
     * 服务对象
     */
    @Resource
    private StsUserService stsUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StsUser selectOne(Integer id) {
        return this.stsUserService.queryById(id);
    }

}