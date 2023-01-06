package com.ehsanzhao.pattern.factory.abstractFactory.factory;

import com.ehsanzhao.pattern.factory.abstractFactory.product.ProductOne;
import com.ehsanzhao.pattern.factory.abstractFactory.product.ProductTwo;

/**
 * @author zhaoyuan
 * @date 2022/12/17
 */
public abstract class Factory {

    public void init(){
        System.out.println("factory init ……");
    }

    public abstract ProductOne createProductOne();

    public abstract ProductTwo createProductTwo();
}
