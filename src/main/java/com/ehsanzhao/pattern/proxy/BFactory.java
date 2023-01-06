package com.ehsanzhao.pattern.proxy;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
public class BFactory implements IFactory{
    @Override
    public float shell() {
        System.out.println("B工厂出厂价"+188);
        return 188f;
    }
}
