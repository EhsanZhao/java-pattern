package com.ehsanzhao.pattern.factory.factoryMethod;

import com.ehsanzhao.pattern.factory.factoryMethod.factory.Factory;
import com.ehsanzhao.pattern.factory.factoryMethod.factory.FactoryOne;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class MainTest {
    public static void main(String[] args) {
        Factory factory = new FactoryOne();
        factory.create().shell();
    }
}
