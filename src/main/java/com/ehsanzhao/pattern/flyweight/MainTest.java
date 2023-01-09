package com.ehsanzhao.pattern.flyweight;

/**
 * @author zhaoyuan
 * @date 2023/1/9
 */
public class MainTest {
    public static void main(String[] args) {
        IProduct product = new SeckillFactory().queryProduct("GUCCI");
        product.getProduct("二手");
        System.out.println(product);

        IProduct product1 = new SeckillFactory().queryProduct("GUCCI");
        product1.getProduct("全新");
        System.out.println(product1);

        System.out.println(product == product1);
    }
}
