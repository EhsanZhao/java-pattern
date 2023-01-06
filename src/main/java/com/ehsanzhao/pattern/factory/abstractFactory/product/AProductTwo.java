package com.ehsanzhao.pattern.factory.abstractFactory.product;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class AProductTwo implements ProductTwo {
    @Override
    public void look() {
        System.out.println("AProductTwo look");
    }

    @Override
    public void eat() {
        System.out.println("AProductTwo eat");
    }
}
