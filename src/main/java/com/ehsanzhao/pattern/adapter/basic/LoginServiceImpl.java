package com.ehsanzhao.pattern.adapter.basic;

import com.ehsanzhao.pattern.adapter.basic.ApiResult;
import com.ehsanzhao.pattern.adapter.basic.ILoginService;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public class LoginServiceImpl implements ILoginService {
    @Override
    public ApiResult login(String username, String password) {
        return new ApiResult(1000, "登录成功", username);
    }
}
