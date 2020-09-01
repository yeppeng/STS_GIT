package cn.sz.twoOfGroup.service;

import cn.sz.twoOfGroup.entity.StsMarket;
import com.github.pagehelper.PageInfo;
import com.sun.imageio.plugins.common.I18N;

import java.util.List;

/**
 * (StsMarket)表服务接口
 *
 * @author makejava
 * @since 2020-09-01 10:20:52
 */
public interface StsMarketService {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    StsMarket queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    PageInfo<StsMarket> findAll(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stsMarket 实例对象
     * @return 实例对象
     */
    StsMarket insert(StsMarket stsMarket);

    /**
     * 修改数据
     *
     * @param stsMarket 实例对象
     * @return 实例对象
     */
    StsMarket update(StsMarket stsMarket);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}