package com.ehsanzhao.pattern.delegate;

/**
 * @author zhaoyuan
 * @date 2023/1/13
 */
public class MainTest {

    public static void main(String[] args) {
        new Boss().command("画图",new Leader());
    }

}
