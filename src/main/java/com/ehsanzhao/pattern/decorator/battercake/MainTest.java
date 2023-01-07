package com.ehsanzhao.pattern.decorator.battercake;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class MainTest {
    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();
        battercake = new EggBattercake(battercake);
        battercake = new EggBattercake(battercake);
        battercake = new LaTiaoBattercake(battercake);
        System.out.println(battercake.cake()+"="+battercake.price());
    }
}
