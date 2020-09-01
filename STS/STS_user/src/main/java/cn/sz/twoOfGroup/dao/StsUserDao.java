package cn.sz.twoOfGroup.dao;

import cn.sz.twoOfGroup.entity.StsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (StsUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 10:18:38
 */
public interface StsUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    StsUser queryById(Integer userId);

    /**
     * 查询数据   *
     *
     * @return 对象列表
     */
    List<StsUser> findAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stsUser 实例对象
     * @return 对象列表
     */
    List<StsUser> queryAll(StsUser stsUser);

    /**
     * 新增数据
     *
     * @param stsUser 实例对象
     * @return 影响行数
     */
    int insert(StsUser stsUser);

    /**
     * 修改数据
     *
     * @param stsUser 实例对象
     * @return 影响行数
     */
    int update(StsUser stsUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

}