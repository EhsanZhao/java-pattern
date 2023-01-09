package com.ehsanzhao.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhaoyuan
 * @date 2023/1/9
 */
public class SeckillFactory {

    private static final Map<String,IProduct> pool = new ConcurrentHashMap<>();

    public IProduct queryProduct(String productName){
        IProduct product = pool.get(productName);
        if(product == null){
            product = new SeckillProduct(productName);
            pool.put(productName,product);
        }
        return product;
    }

}
