package com.ehsanzhao.pattern.adapter;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public class MainTest {

    public static void main(String[] args) {
        ILoginForThird iLoginForThird = new LoginForThirdAdapter();

        System.out.println(iLoginForThird.loginForMobile("18362053636","123456"));

    }

}
