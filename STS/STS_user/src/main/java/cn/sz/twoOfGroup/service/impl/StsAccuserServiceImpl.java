package cn.sz.twoOfGroup.service.impl;

import cn.sz.twoOfGroup.dao.StsAccuserDao;
import cn.sz.twoOfGroup.entity.StsAccuser;
import cn.sz.twoOfGroup.service.StsAccuserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StsAccuser)表服务实现类
 *
 * @author makejava
 * @since 2020-09-01 10:19:23
 */
@Service("stsAccuserService")
public class StsAccuserServiceImpl implements StsAccuserService {
    @Resource
    private StsAccuserDao stsAccuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param accuserId 主键
     * @return 实例对象
     */
    @Override
    public StsAccuser queryById(Integer accuserId) {
        return this.stsAccuserDao.queryById(accuserId);
    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param size  查询条数
     * @return 对象列表
     */
    @Override
    public PageInfo<StsAccuser> findAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<StsAccuser> list = this.stsAccuserDao.findAll();
        PageInfo<StsAccuser> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param stsAccuser 实例对象
     * @return 实例对象
     */
    @Override
    public StsAccuser insert(StsAccuser stsAccuser) {
        this.stsAccuserDao.insert(stsAccuser);
        return stsAccuser;
    }

    /**
     * 修改数据
     *
     * @param stsAccuser 实例对象
     * @return 实例对象
     */
    @Override
    public StsAccuser update(StsAccuser stsAccuser) {
        this.stsAccuserDao.update(stsAccuser);
        return this.queryById(stsAccuser.getAccuserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param accuserId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer accuserId) {
        return this.stsAccuserDao.deleteById(accuserId) > 0;
    }
}