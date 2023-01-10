package com.ehsanzhao.pattern.composite;

import lombok.Data;

/**
 * @author zhaoyuan
 * @date 2023/1/10
 */
@Data
public abstract class IMenu {

    private String name;

    public IMenu(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(this.name);
    }

}
