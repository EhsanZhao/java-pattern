package com.ehsanzhao.pattern.decorator.battercake;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake){
        this.battercake = battercake;
    }

    @Override
    public String cake() {
        return battercake.cake();
    }

    @Override
    public Integer price() {
        return battercake.price();
    }
}
