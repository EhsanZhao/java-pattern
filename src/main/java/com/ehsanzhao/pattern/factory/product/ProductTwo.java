package com.ehsanzhao.pattern.factory.product;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class ProductTwo implements Product{
    @Override
    public void shell() {
        System.out.println("product two shell");
    }
}
