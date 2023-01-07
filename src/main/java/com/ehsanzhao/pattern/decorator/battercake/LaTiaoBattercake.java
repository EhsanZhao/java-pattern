package com.ehsanzhao.pattern.decorator.battercake;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class LaTiaoBattercake extends BattercakeDecorator{

    public LaTiaoBattercake(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String cake() {
        return super.cake()+"+1包辣条";
    }

    @Override
    public Integer price() {
        return super.price()+2;
    }
}
