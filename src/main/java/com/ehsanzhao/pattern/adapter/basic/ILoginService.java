package com.ehsanzhao.pattern.adapter.basic;

import com.ehsanzhao.pattern.adapter.basic.ApiResult;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public interface ILoginService {

    ApiResult login(String username, String password);

}
