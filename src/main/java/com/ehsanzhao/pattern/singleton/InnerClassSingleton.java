package com.ehsanzhao.pattern.singleton;

import java.io.Serializable;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public class InnerClassSingleton implements Serializable {
    private InnerClassSingleton(){};

    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    private static class InnerClass{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
}
