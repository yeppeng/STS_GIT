package cn.sz.twoOfGroup.dao;

import cn.sz.twoOfGroup.entity.StsAccuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (StsAccuser)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 10:19:22
 */
public interface StsAccuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param accuserId 主键
     * @return 实例对象
     */
    StsAccuser queryById(Integer accuserId);

    /**
     * 查询指定行数据
     * @return 对象列表
     */
    List<StsAccuser> findAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stsAccuser 实例对象
     * @return 对象列表
     */
    List<StsAccuser> queryAll(StsAccuser stsAccuser);

    /**
     * 新增数据
     *
     * @param stsAccuser 实例对象
     * @return 影响行数
     */
    int insert(StsAccuser stsAccuser);

    /**
     * 修改数据
     *
     * @param stsAccuser 实例对象
     * @return 影响行数
     */
    int update(StsAccuser stsAccuser);

    /**
     * 通过主键删除数据
     *
     * @param accuserId 主键
     * @return 影响行数
     */
    int deleteById(Integer accuserId);

}