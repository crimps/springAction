/**
 * @(#)com.crimps.springAction.chapter1.DestoryImpl2.java Copyright (c) 2014-2018 crimps
 */
package com.crimps.springAction.chapter1;

/**
 * @author crimps
 * @version 1.0  2017/3/14
 * @modified crimps  2017/3/14  <创建>
 */
public class DestoryImpl2 implements DestoryApi {
    private String message;

    public DestoryImpl2() {
        this.message = "Destory World !";
    }

    public DestoryImpl2(String message) {
        this.message = message;
    }

    public void destoryWorld() {
        System.out.println(message);
    }
}