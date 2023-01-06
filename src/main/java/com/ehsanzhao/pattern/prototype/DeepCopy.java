package com.ehsanzhao.pattern.prototype;

import lombok.Data;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhaoyuan
 * @date 2023/1/3
 */
@Data
public class DeepCopy implements Serializable {

    private String name;

    private Integer age;

    private List<String> hobbies;

    public DeepCopy(String name, Integer age, List<String> hobbies){
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public DeepCopy deepClone(){
        byte[] bytes = SerializationUtils.serialize(this);
        return  SerializationUtils.deserialize(bytes);
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
