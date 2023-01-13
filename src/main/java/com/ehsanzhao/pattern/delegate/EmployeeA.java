package com.ehsanzhao.pattern.delegate;

import java.util.Map;

/**
 * @author zhaoyuan
 * @date 2023/1/13
 */
public class EmployeeA implements IEmployee{

    @Override
    public void doing(String task) {
        System.out.println("我是插画师，正在做"+task);
    }
}
