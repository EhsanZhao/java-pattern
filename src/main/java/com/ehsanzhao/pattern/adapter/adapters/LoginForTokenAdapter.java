package com.ehsanzhao.pattern.adapter.adapters;

import com.ehsanzhao.pattern.adapter.LoginPassword;
import com.ehsanzhao.pattern.adapter.basic.ApiResult;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public class LoginForTokenAdapter extends LoginPassword {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginForTokenAdapter;
    }

    @Override
    public ApiResult login(String username, Object adapter) {
        return super.loginPassword(username,null);
    }
}
