package com.ehsanzhao.pattern.factory.abstractFactory.factory;

import com.ehsanzhao.pattern.factory.abstractFactory.product.AProductOne;
import com.ehsanzhao.pattern.factory.abstractFactory.product.AProductTwo;
import com.ehsanzhao.pattern.factory.abstractFactory.product.ProductOne;
import com.ehsanzhao.pattern.factory.abstractFactory.product.ProductTwo;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class AFactory extends Factory {

    @Override
    public ProductOne createProductOne() {
        super.init();
        return new AProductOne();
    }

    @Override
    public ProductTwo createProductTwo() {
        return new AProductTwo();
    }
}
