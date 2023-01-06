package com.ehsanzhao.pattern.singleton;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public class LazySyncSafeSingleton {
    private static LazySyncSafeSingleton lazySingleton;

    private LazySyncSafeSingleton(){};

    // synchronized方法,多线程情况下保证单例对象唯一
    public static synchronized LazySyncSafeSingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySyncSafeSingleton();
        }
        return lazySingleton;
    }
}
