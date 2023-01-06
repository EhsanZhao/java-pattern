package com.ehsanzhao.pattern.factory.simpleFactory;

import com.ehsanzhao.pattern.factory.product.Product;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class SimpleFactory {
    public Product create(Class<? extends Product> clazz) throws InstantiationException, IllegalAccessException {
        System.out.println("创建Product");
        return clazz.newInstance();
    }
}
