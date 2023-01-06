package com.ehsanzhao.pattern.singleton;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public enum EnumSingleton {
    INSTANCE;
    public void doSomething(){
        System.out.println("do something...");
    }
}
