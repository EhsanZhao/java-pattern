package com.ehsanzhao.pattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyuan
 * @date 2023/1/10
 */
public class MenuLeaf extends IMenu{

    public MenuLeaf(String name) {
        super(name);
    }

}
