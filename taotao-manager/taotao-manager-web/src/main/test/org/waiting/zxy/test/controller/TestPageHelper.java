package org.waiting.zxy.test.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.waiting.zxy.taotao.mapper.TbContentMapper;

/**
 * <p>
 * 测试分页插件
 * </p>
 *
 * @author Waiting
 * @since 2017/9/14 23:18
 */
public class TestPageHelper {

    @Test
    public void testPageHelper(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
         applicationContext.getBean(TbContentMapper.class);
    }
}
