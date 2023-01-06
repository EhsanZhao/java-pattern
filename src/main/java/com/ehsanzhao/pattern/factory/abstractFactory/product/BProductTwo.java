package com.ehsanzhao.pattern.factory.abstractFactory.product;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class BProductTwo implements ProductTwo {
    @Override
    public void look() {
        System.out.println("BProductTwo look");
    }

    @Override
    public void eat() {
        System.out.println("BProductTwo eat");
    }
}
