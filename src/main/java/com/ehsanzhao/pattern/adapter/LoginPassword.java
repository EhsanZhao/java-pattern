package com.ehsanzhao.pattern.adapter;

import com.ehsanzhao.pattern.adapter.adapters.ILoginForThirdAdapter;
import com.ehsanzhao.pattern.adapter.basic.ApiResult;
import com.ehsanzhao.pattern.adapter.basic.LoginServiceImpl;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public abstract class LoginPassword extends LoginServiceImpl implements ILoginForThirdAdapter{

    public ApiResult loginPassword(String username, String password){
        if(password == null){
            password = "EMPTY_THIRD";
        }
        return super.login(username,password);
    }

}
