package cn.sz.twoOfGroup.controller;

import cn.sz.twoOfGroup.entity.StsMarket;
import cn.sz.twoOfGroup.service.StsMarketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (StsMarket)表控制层
 *
 * @author makejava
 * @since 2020-09-01 10:20:54
 */
@RestController
@RequestMapping("stsMarket")
public class StsMarketController {
    /**
     * 服务对象
     */
    @Resource
    private StsMarketService stsMarketService;



}