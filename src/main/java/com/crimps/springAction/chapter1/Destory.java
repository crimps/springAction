/**
 * @(#)com.crimps.springAction.chapter1.Destory.java Copyright (c) 2014-2018 crimps
 */
package com.crimps.springAction.chapter1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author crimps
 * @version 1.0  2017/3/13
 * @modified crimps  2017/3/13  <创建>
 */
public class Destory {
    @Test
    public void testDestoryWorld() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter1/destoryworld.xml");
        DestoryApi destoryApi = context.getBean("destory", DestoryApi.class);
        destoryApi.destoryWorld();
    }

    @Test
    public void testDestoryWorld2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/destoryworld-init.xml");
        DestoryApi destoryApi = context.getBean("destoryInit", DestoryApi.class);
        destoryApi.destoryWorld();

        DestoryApi destoryApi1 = context.getBean("destoryInit2", DestoryApi.class);
        destoryApi1.destoryWorld();
    }
}