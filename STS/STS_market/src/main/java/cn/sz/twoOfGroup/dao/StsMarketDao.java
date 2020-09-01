package cn.sz.twoOfGroup.dao;

import cn.sz.twoOfGroup.entity.StsMarket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (StsMarket)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 10:20:50
 */
public interface StsMarketDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    StsMarket queryById(@Param("marketId") Integer id);

    /**
     * 分页查询指定行数据

     * @return 对象列表
     */
    List<StsMarket> findAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stsMarket 实例对象
     * @return 对象列表
     */
    List<StsMarket> queryAll(StsMarket stsMarket);

    /**
     * 新增数据
     *
     * @param stsMarket 实例对象
     * @return 影响行数
     */
    int insert(StsMarket stsMarket);

    /**
     * 修改数据
     *
     * @param stsMarket 实例对象
     * @return 影响行数
     */
    int update(StsMarket stsMarket);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 影响行数
     */
    int deleteById(@Param("marketId") Integer marketId);

}