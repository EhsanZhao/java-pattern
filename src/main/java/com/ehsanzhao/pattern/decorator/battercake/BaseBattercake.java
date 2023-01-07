package com.ehsanzhao.pattern.decorator.battercake;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class BaseBattercake extends Battercake{

    @Override
    public String cake() {
        return "煎饼";
    }

    @Override
    public Integer price() {
        return 5;
    }
}
