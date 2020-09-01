package cn.sz.twoOfGroup.controller;

import cn.sz.twoOfGroup.entity.StsAccuser;
import cn.sz.twoOfGroup.service.StsAccuserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (StsAccuser)表控制层
 *
 * @author makejava
 * @since 2020-09-01 10:19:24
 */
@RestController
@RequestMapping("stsAccuser")
public class StsAccuserController {
    /**
     * 服务对象
     */
    @Resource
    private StsAccuserService stsAccuserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StsAccuser selectOne(Integer id) {
        return this.stsAccuserService.queryById(id);
    }

}