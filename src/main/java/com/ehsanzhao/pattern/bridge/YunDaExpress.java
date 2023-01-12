package com.ehsanzhao.pattern.bridge;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
public class YunDaExpress implements IExpress{

    @Override
    public void sendExpress(String message) {
        System.out.println("韵达快递  "+ message);
    }
    
}
