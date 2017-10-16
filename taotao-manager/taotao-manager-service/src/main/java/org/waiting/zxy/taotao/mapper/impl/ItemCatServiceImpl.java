package org.waiting.zxy.taotao.mapper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.waiting.zxy.taotao.mapper.IItemCatService;
import org.waiting.zxy.taotao.mapper.TbItemCatMapper;
import org.waiting.zxy.taotao.pojo.TbItemCat;
import org.waiting.zxy.taotao.pojo.TbItemCatExample;
import org.waiting.zxy.util.pojo.EUTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商品类目 服务类
 * </p>
 *
 * @author Waiting
 * @since 2017/9/16 21:59
 */
@Service
public class ItemCatServiceImpl implements IItemCatService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EUTreeNode> getItemCatList(long parentId) {
        //根据parentId查询分类列表
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        //设置查询条件
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andIdEqualTo(parentId);
        //执行查询
        List<TbItemCat> tbItemCatList = tbItemCatMapper.selectByExample(tbItemCatExample);
        //分类列表转换成TreeNode的列表
        List<EUTreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat :tbItemCatList) {
            //创建一个TreeNode对象
            EUTreeNode treeNode = new EUTreeNode();
            treeNode.setId(tbItemCat.getId());
            treeNode.setText(tbItemCat.getName());
            treeNode.setState(tbItemCat.getIsParent()?"close":"open");
            resultList.add(treeNode);
        }
        return resultList;
    }
}
