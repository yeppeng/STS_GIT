package cn.sz.twoOfGroup.service.impl;

import cn.sz.twoOfGroup.dao.StsUserDao;
import cn.sz.twoOfGroup.entity.StsUser;
import cn.sz.twoOfGroup.service.StsUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StsUser)表服务实现类
 *
 * @author makejava
 * @since 2020-09-01 10:18:42
 */
@Service("stsUserService")
public class StsUserServiceImpl implements StsUserService {
    @Resource
    private StsUserDao stsUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public StsUser queryById(Integer userId) {
        return this.stsUserDao.queryById(userId);
    }

    /**
     * 分页查询多条数据
     *
     *
     * @return 对象列表
     */
    @Override
    public PageInfo<StsUser> findAll(int page, int size) {
        PageHelper.startPage(page,size);
        List<StsUser> list = this.stsUserDao.findAll();
        PageInfo<StsUser> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param stsUser 实例对象
     * @return 实例对象
     */
    @Override
    public StsUser insert(StsUser stsUser) {
        this.stsUserDao.insert(stsUser);
        return stsUser;
    }

    /**
     * 修改数据
     *
     * @param stsUser 实例对象
     * @return 实例对象
     */
    @Override
    public StsUser update(StsUser stsUser) {
        this.stsUserDao.update(stsUser);
        return this.queryById(stsUser.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.stsUserDao.deleteById(userId) > 0;
    }
}