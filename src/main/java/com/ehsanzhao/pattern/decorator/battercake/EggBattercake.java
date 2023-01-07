package com.ehsanzhao.pattern.decorator.battercake;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class EggBattercake extends BattercakeDecorator{

    public EggBattercake(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String cake() {
        return super.cake()+"+1个鸡蛋";
    }

    @Override
    public Integer price() {
        return super.price()+1;
    }
}
