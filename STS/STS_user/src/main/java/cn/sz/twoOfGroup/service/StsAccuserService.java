package cn.sz.twoOfGroup.service;

import cn.sz.twoOfGroup.entity.StsAccuser;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (StsAccuser)表服务接口
 *
 * @author makejava
 * @since 2020-09-01 10:19:23
 */
public interface StsAccuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param accuserId 主键
     * @return 实例对象
     */
    StsAccuser queryById(Integer accuserId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    PageInfo<StsAccuser> findAll(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stsAccuser 实例对象
     * @return 实例对象
     */
    StsAccuser insert(StsAccuser stsAccuser);

    /**
     * 修改数据
     *
     * @param stsAccuser 实例对象
     * @return 实例对象
     */
    StsAccuser update(StsAccuser stsAccuser);

    /**
     * 通过主键删除数据
     *
     * @param accuserId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer accuserId);

}