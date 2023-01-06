package com.ehsanzhao.pattern.singleton;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhaoyuan
 * @date 2022/12/24
 */
public class MianTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);
        Class clazz = Class.forName("com.ehsanzhao.pattern.singleton.HungrySingleton");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            if("flag".equals(field.getName())){
                field.setAccessible(true);
                field.setBoolean(hungrySingleton2,false);
            }
        }
        Constructor<HungrySingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton object = constructor.newInstance();
        System.out.println(hungrySingleton2 == object);

        byte[] serializes0 = SerializationUtils.serialize(hungrySingleton1);
        HungrySingleton hungrySingleton3 = SerializationUtils.deserialize(serializes0);
        System.out.println(hungrySingleton3 == hungrySingleton2);


        new Thread(){
            @Override
            public void run() {
                LazySingleton lazySingleton1 = LazySingleton.getInstance();
                System.out.println(lazySingleton1);
            }
        }.start();

        new Thread(){
                @Override
                public void run() {
                    LazySingleton lazySingleton2 = LazySingleton.getInstance();
                    System.out.println(lazySingleton2);
                }
        }.start();

        new Thread(){
            @Override
            public void run() {
                InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
                System.out.println(innerClassSingleton);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
                System.out.println(innerClassSingleton);
            }
        }.start();

        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        System.out.println(innerClassSingleton1 == innerClassSingleton2);
        // 序列化
        byte[] serializes = SerializationUtils.serialize(innerClassSingleton2);
        InnerClassSingleton innerClassSingleton3 = SerializationUtils.deserialize(serializes);
        System.out.println(innerClassSingleton3 == innerClassSingleton2);
        // 反射
        Class clazz0 = Class.forName("com.ehsanzhao.pattern.singleton.InnerClassSingleton");
        Constructor<InnerClassSingleton> constructor0 = clazz0.getDeclaredConstructor();
        constructor0.setAccessible(true);
        InnerClassSingleton object0 = constructor0.newInstance();
        System.out.println(innerClassSingleton1 == object0);

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1 == enumSingleton2);
        Class clazz1 = Class.forName("com.ehsanzhao.pattern.singleton.EnumSingleton");
        EnumSingleton enumSingleton3 = (EnumSingleton) clazz1.newInstance();
        System.out.println(enumSingleton1 == enumSingleton3);
        Constructor<EnumSingleton> constructor1 = clazz1.getDeclaredConstructor();
        constructor1.setAccessible(true);
        EnumSingleton object1 = constructor1.newInstance();
        System.out.println(enumSingleton1 == object1);
    }
}
