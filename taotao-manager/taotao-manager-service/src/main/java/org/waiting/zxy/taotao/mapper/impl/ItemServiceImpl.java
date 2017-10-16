package org.waiting.zxy.taotao.mapper.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.waiting.zxy.taotao.pojo.TbItem;
import org.waiting.zxy.taotao.pojo.TbItemExample;
import org.waiting.zxy.taotao.mapper.IItemService;
import org.waiting.zxy.taotao.mapper.TbItemMapper;
import org.waiting.zxy.util.pojo.EUDataGridResult;

import java.util.List;

/**
 * <p>
 * 商品表 服务类的实现
 * </p>
 * @author Waiting
 * @since 2017/9/13 22:22
 */
@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        //根据查询条件查询
        TbItemExample tbItemExample =new TbItemExample();
        TbItemExample.Criteria criteria=tbItemExample.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> tbItemList = tbItemMapper.selectByExample(tbItemExample);
        if(tbItemList!=null && tbItemList.size()>0){
            return tbItemList.get(0);
        }
        return tbItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EUDataGridResult getItemList(Integer page, Integer rows) {
        //查询商品列表
        TbItemExample tbItemExample =new TbItemExample();
        PageHelper.startPage(page,rows);
        List<TbItem> tbItemExampleList=tbItemMapper.selectByExample(tbItemExample);
        EUDataGridResult euDataGridResult =new EUDataGridResult();
        euDataGridResult.setRows(tbItemExampleList);
        PageInfo<TbItem> tbItemPageInfo =new PageInfo<>(tbItemExampleList);
        euDataGridResult.setTotal(tbItemPageInfo.getTotal());
        return euDataGridResult;
    }
}
