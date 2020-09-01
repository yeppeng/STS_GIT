package cn.sz.twoOfGroup.service.impl;

import cn.sz.twoOfGroup.dao.StsMarketDao;
import cn.sz.twoOfGroup.entity.StsMarket;
import cn.sz.twoOfGroup.service.StsMarketService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StsMarket)表服务实现类
 *
 * @author makejava
 * @since 2020-09-01 10:20:53
 */
@Service("stsMarketService")
public class StsMarketServiceImpl implements StsMarketService {
    @Resource
    private StsMarketDao stsMarketDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public StsMarket queryById(Integer id) {
        return this.stsMarketDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param size  查询条数
     * @return 对象列表
     */
    @Override
    public PageInfo<StsMarket> findAll(int page, int size) {
        PageHelper.startPage(page,size);
        List<StsMarket> list = stsMarketDao.findAll();
        PageInfo<StsMarket> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param stsMarket 实例对象
     * @return 实例对象
     */
    @Override
    public StsMarket insert(StsMarket stsMarket) {
        this.stsMarketDao.insert(stsMarket);
        return stsMarket;
    }

    /**
     * 修改数据
     *
     * @param stsMarket 实例对象
     * @return 实例对象
     */
    @Override
    public StsMarket update(StsMarket stsMarket) {
        this.stsMarketDao.update(stsMarket);
        return this.queryById(stsMarket.getMarketId());
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.stsMarketDao.deleteById(id) > 0;
    }
}