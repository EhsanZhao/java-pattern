package com.ehsanzhao.pattern.delegate;

/**
 * @author zhaoyuan
 * @date 2023/1/13
 */
public class EmployeeB implements IEmployee{

    @Override
    public void doing(String task) {
        System.out.println("我是建造师，正在做"+task);
    }
}
