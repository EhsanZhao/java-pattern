package com.ehsanzhao.pattern.singleton;

import java.io.Serializable;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private static volatile boolean flag = true;
    private HungrySingleton(){
        synchronized (HungrySingleton.class) {
            if(!flag){
                flag = true;
            }else{
                throw new RuntimeException("单例只能创建⼀个");
            }
        }
    }

//    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //添加此方法阻止序列化时重新生成对象
    private Object readResolve() {
        return hungrySingleton;
    }

}
