package cn.sz.twoOfGroup.service;

import cn.sz.twoOfGroup.entity.StsUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (StsUser)表服务接口
 *
 * @author makejava
 * @since 2020-09-01 10:18:41
 */
public interface StsUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    StsUser queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    PageInfo<StsUser> findAll(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stsUser 实例对象
     * @return 实例对象
     */
    StsUser insert(StsUser stsUser);

    /**
     * 修改数据
     *
     * @param stsUser 实例对象
     * @return 实例对象
     */
    StsUser update(StsUser stsUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}