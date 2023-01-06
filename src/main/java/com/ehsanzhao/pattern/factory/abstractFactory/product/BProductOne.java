package com.ehsanzhao.pattern.factory.abstractFactory.product;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class BProductOne implements ProductOne {

    @Override
    public void shell() {
        System.out.println("BProductOne shell");
    }
}
