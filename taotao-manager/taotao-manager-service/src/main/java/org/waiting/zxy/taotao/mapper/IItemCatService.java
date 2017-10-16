package org.waiting.zxy.taotao.mapper;


import org.waiting.zxy.util.pojo.EUTreeNode;

import java.util.List;

/**
 * <p>
 * 商品类目 服务类
 * </p>
 *
 * @author waiting
 * @since 2017-09-10
 */
public interface IItemCatService  {
    List<EUTreeNode> getItemCatList(long parentId);
}
