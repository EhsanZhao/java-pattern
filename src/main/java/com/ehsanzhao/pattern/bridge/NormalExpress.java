package com.ehsanzhao.pattern.bridge;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
public class NormalExpress extends ExpressGrade{

    public NormalExpress(IExpress express) {
        super(express);
    }

    @Override
    public void setGrade(String message) {
        super.setGrade("【正常】" + message);
    }
}
