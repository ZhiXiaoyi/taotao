package org.waiting.zxy.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.waiting.zxy.taotao.pojo.TbItem;
import org.waiting.zxy.taotao.mapper.IItemService;
import org.waiting.zxy.util.pojo.EUDataGridResult;

/**
 * <p>
 * 商品集 服务集 controller
 * </p>
 *
 * @author Waiting
 * @since 2017/9/13 22:41
 */
@Controller
@RequestMapping("//item")
public class ItemController {

    @Autowired
    private IItemService itemServiceImpl;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemServiceImpl.getItemById(itemId);
        return tbItem;
    }

    @RequestMapping("/list")
    @ResponseBody
    public EUDataGridResult getItemList(Integer page,Integer rows) {
        EUDataGridResult euDataGridResult=itemServiceImpl.getItemList(page,rows);
        return euDataGridResult;
    }

}
