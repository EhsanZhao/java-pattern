package com.ehsanzhao.pattern.adapter;

import com.ehsanzhao.pattern.adapter.adapters.*;
import com.ehsanzhao.pattern.adapter.basic.ApiResult;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public class LoginForThirdAdapter implements ILoginForThird {

    @Override
    public ApiResult loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ApiResult loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ApiResult loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ApiResult loginForMobile(String mobile, String code) {
        if("123456".equals(code)){
            return processLogin(mobile, LoginForMobileAdapter.class);
        }
        return new ApiResult(1100,"验证码错误",null);
    }

    public ApiResult processLogin(String username, Class<? extends ILoginForThirdAdapter> clazz){
        try {
            ILoginForThirdAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(username,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
