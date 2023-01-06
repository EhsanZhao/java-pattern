package com.ehsanzhao.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
public class AShopProxy implements InvocationHandler {
    private IFactory target;

    public IFactory getInstance(IFactory target){
        this.target = target;
        return (IFactory) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入A代理商店买工厂的东西");
        float price = (float) method.invoke(this.target,args);
        System.out.println("A代理商店加价200");
        price += 200;
        return price;
    }
}
