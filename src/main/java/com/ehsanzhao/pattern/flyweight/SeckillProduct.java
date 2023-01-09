package com.ehsanzhao.pattern.flyweight;

import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

/**
 * @author zhaoyuan
 * @date 2023/1/9
 */
public class SeckillProduct implements IProduct{

    private String productName;

    private String isOld;

    public SeckillProduct(String productName){ //productName为内部状态
        this.productName = productName;
    }

    @Override
    public IProduct getProduct(String isOld){ //isOld为外部状态
        this.isOld = isOld;
        System.out.println("产品："+this.productName+"，新旧："+this.isOld);
        return this;
    }

}
