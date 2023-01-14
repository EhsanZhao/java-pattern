package com.ehsanzhao.pattern.template;

/**
 * @author zhaoyuan
 * @date 2023/1/14
 */
public abstract class RunTemplate {

    public final void execute(){
        stepOne();
        stepTwo();
        if(isOpen()) stepThree();
    }

    //钩子方法
    public boolean isOpen() {
        return false;
    }

    public void stepOne(){
        System.out.println("执行步骤一");
    }

    abstract void stepTwo();

    public void stepThree(){
        System.out.println("执行步骤三");
    }
}
