package com.ehsanzhao.pattern.bridge;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
public class UrgentExpress extends ExpressGrade{

    public UrgentExpress(IExpress express) {
        super(express);
    }

    @Override
    public void setGrade(String message) {
        super.setGrade("【加急】"+message);
    }
}
