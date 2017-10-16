package org.waiting.zxy.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 页面跳转Controller
 * </p>
 *
 * @author Waiting
 * @since 2017/9/14 22:27
 */
@Controller
public class PageController {
    /**
     * 打开首页
     */
    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }
    /**
     * 展示其他页面
     * <p>Title: showpage</p>
     * <p>Description: </p>
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }
}
