package org.waiting.zxy.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.waiting.zxy.taotao.mapper.IItemCatService;
import org.waiting.zxy.taotao.mapper.impl.ItemCatServiceImpl;
import org.waiting.zxy.util.pojo.EUTreeNode;

import java.util.List;

/**
 * <p>
 * 商品分类管理Controller
 * </p>
 *
 * @author Waiting
 * @since 2017/9/16 22:11
 */
@RestController
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private IItemCatService itemCatServiceImpl;

    @RequestMapping("/list")
    public List<EUTreeNode> getItemCatList(@RequestParam(value="id", defaultValue="0")Long parentId) {
        List<EUTreeNode> list = itemCatServiceImpl.getItemCatList(parentId);
        return list;
    }

}
