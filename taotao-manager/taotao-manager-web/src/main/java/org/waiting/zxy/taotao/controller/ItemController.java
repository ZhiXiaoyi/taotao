package org.waiting.zxy.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.waiting.zxy.taotao.pojo.TbItem;
import org.waiting.zxy.taotao.mapper.IItemService;

/**
 * <p>
 * 商品集 服务集 controller
 * </p>
 *
 * @author Waiting
 * @since 2017/9/13 22:41
 */
@RestController
public class ItemController {
    @Autowired
    private IItemService itemService;

    @RequestMapping("/item/{itemId}")
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

}
