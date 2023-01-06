package com.ehsanzhao.pattern.singleton;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public class LazyDoubleCheckSingleton {
    // volatile 可以禁止指令重排序
    private static volatile LazyDoubleCheckSingleton lazySingleton;

    private LazyDoubleCheckSingleton(){};

    // synchronized方法,多线程情况下保证单例对象唯一
    public static LazyDoubleCheckSingleton getInstance(){
        //双重锁检查 Double Check Lock - DCL
        if(lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
