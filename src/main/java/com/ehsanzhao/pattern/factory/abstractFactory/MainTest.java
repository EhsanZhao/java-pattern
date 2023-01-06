package com.ehsanzhao.pattern.factory.abstractFactory;

import com.ehsanzhao.pattern.factory.abstractFactory.factory.AFactory;
import com.ehsanzhao.pattern.factory.abstractFactory.factory.BFactory;
import com.ehsanzhao.pattern.factory.abstractFactory.factory.Factory;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public class MainTest {
    public static void main(String[] args) {
        Factory factory = new AFactory();
        factory.createProductOne().shell();
        factory.createProductTwo().eat();
        new BFactory().createProductTwo().look();
    }
}
