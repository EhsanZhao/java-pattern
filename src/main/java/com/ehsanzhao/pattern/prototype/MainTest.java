package com.ehsanzhao.pattern.prototype;

import java.util.ArrayList;

/**
 * @author zhaoyuan
 * @date 2023/1/3
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy deepCopy1 = new DeepCopy("张三",24,new ArrayList<String>() {{
            add("徒步");
            add("看书");
        }});
        System.out.println(deepCopy1);
        System.out.println(deepCopy1.getHobbies());
        DeepCopy deepCopy2 = deepCopy1.deepClone();
        System.out.println(deepCopy2);
        System.out.println(deepCopy2.getHobbies());
        System.out.println(deepCopy1 == deepCopy2);
        deepCopy2.getHobbies().add("旅游");
        System.out.println(deepCopy1.getHobbies());
        System.out.println(deepCopy2.getHobbies());
        System.out.println(deepCopy1.getHobbies() == deepCopy2.getHobbies());

//        ShallowCopy shallowCopy1 = new ShallowCopy("张三",24,new ArrayList<String>() {{
//            add("徒步");
//            add("看书");
//        }});
//        System.out.println(shallowCopy1);
//        System.out.println(shallowCopy1.getHobbies());
//        ShallowCopy shallowCopy2 = shallowCopy1.clone();
//        System.out.println(shallowCopy2);
//        System.out.println(shallowCopy2.getHobbies());
//        System.out.println(shallowCopy1 == shallowCopy2);
//        shallowCopy2.getHobbies().add("旅游");
//        System.out.println(shallowCopy1.getHobbies());
//        System.out.println(shallowCopy2.getHobbies());
//        System.out.println(shallowCopy1.getHobbies() == shallowCopy2.getHobbies());
    }
}
