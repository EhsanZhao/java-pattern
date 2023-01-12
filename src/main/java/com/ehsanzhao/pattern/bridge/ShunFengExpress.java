package com.ehsanzhao.pattern.bridge;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
public class ShunFengExpress implements IExpress{

    @Override
    public void sendExpress(String message) {
        System.out.println("顺丰快递 " + message);
    }

}
