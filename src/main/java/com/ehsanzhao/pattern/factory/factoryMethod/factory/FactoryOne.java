package com.ehsanzhao.pattern.factory.factoryMethod.factory;

import com.ehsanzhao.pattern.factory.product.Product;
import com.ehsanzhao.pattern.factory.product.ProductOne;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class FactoryOne implements Factory{
    @Override
    public Product create() {
        return new ProductOne();
    }
}
