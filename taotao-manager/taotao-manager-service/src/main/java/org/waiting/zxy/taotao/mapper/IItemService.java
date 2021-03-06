package org.waiting.zxy.taotao.mapper;


import org.waiting.zxy.taotao.pojo.TbItem;
import org.waiting.zxy.util.pojo.EUDataGridResult;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author waiting
 * @since 2017-09-10
 */
public interface IItemService{

    TbItem getItemById(Long itemId);

    EUDataGridResult getItemList(Integer page ,Integer rows);
}
