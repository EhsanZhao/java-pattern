package com.ehsanzhao.pattern.proxy;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
public class MainTest {
    public static void main(String[] args) {
        AShop shop1 = new AShop(new AFactory());
        AShop shop2 = new AShop(new BFactory());
        shop1.shell();
        shop2.shell();

        AShopProxy aShopProxy = new AShopProxy();
        aShopProxy.getInstance(new AFactory()).shell();
        aShopProxy.getInstance(new BFactory()).shell();
    }
}
