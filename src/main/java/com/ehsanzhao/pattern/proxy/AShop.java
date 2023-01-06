package com.ehsanzhao.pattern.proxy;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
public class AShop implements IFactory{

    private IFactory iFactory;

    public AShop(IFactory iFactory){
        this.iFactory = iFactory;
    }

    @Override
    public float shell() {
        System.out.println("进入A商店买工厂的东西");
        float price = iFactory.shell();
        System.out.println("A商店加价200");
        price += 200;
        return price;
    }
}
