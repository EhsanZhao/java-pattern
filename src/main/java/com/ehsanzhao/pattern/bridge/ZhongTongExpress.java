package com.ehsanzhao.pattern.bridge;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
public class ZhongTongExpress implements IExpress{

    @Override
    public void sendExpress(String message) {
        System.out.println("中通快递 "+message);
    }
    
}
