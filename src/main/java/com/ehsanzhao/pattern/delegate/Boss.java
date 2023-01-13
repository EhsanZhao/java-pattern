package com.ehsanzhao.pattern.delegate;

/**
 * @author zhaoyuan
 * @date 2023/1/13
 */
public class Boss{

    public void command(String task,IEmployee employee) {
        employee.doing(task);
    }
}
