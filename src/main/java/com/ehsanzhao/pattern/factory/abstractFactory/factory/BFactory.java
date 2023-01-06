package com.ehsanzhao.pattern.factory.abstractFactory.factory;

import com.ehsanzhao.pattern.factory.abstractFactory.product.BProductOne;
import com.ehsanzhao.pattern.factory.abstractFactory.product.BProductTwo;
import com.ehsanzhao.pattern.factory.abstractFactory.product.ProductOne;
import com.ehsanzhao.pattern.factory.abstractFactory.product.ProductTwo;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class BFactory extends Factory {
    @Override
    public ProductOne createProductOne() {
        return new BProductOne();
    }

    @Override
    public ProductTwo createProductTwo() {
        return new BProductTwo();
    }
}
