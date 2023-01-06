package com.ehsanzhao.pattern.prototype;

import lombok.Data;

import java.util.List;

/**
 * @author zhaoyuan
 * @date 2023/1/3
 */
@Data
public class ShallowCopy implements Cloneable{

    private String name;

    private Integer age;

    private List<String> hobbies;

    public ShallowCopy(String name,Integer age, List<String> hobbies){
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public ShallowCopy clone() throws CloneNotSupportedException {
        return (ShallowCopy) super.clone();
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
