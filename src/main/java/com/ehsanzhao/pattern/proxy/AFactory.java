package com.ehsanzhao.pattern.proxy;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
public class AFactory implements IFactory{
    @Override
    public float shell() {
        System.out.println("A工厂出厂价"+13.5);
        return 13.5f;
    }
}
