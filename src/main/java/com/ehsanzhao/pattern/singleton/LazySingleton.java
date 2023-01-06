package com.ehsanzhao.pattern.singleton;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
