package com.ehsanzhao.pattern.template;

/**
 * @author zhaoyuan
 * @date 2023/1/14
 */
public class SelfRun extends RunTemplate{

    private boolean isOpenThree = false;

    public void setOpenThree(boolean openThree) {
        isOpenThree = openThree;
    }

    @Override
    public boolean isOpen() {
        return this.isOpenThree;
    }

    @Override
    void stepTwo() {
        System.out.println("我的第二部");
    }

    @Override
    public void stepThree() {
        super.stepThree();
        System.out.println("我的第三步");
    }
}
