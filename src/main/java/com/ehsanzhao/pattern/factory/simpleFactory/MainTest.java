package com.ehsanzhao.pattern.factory.simpleFactory;

import com.ehsanzhao.pattern.factory.product.Product;
import com.ehsanzhao.pattern.factory.product.ProductOne;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class MainTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Product product = new SimpleFactory().create(ProductOne.class);
        product.shell();
    }
}
