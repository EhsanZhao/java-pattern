package com.ehsanzhao.pattern.adapter.adapters;

import com.ehsanzhao.pattern.adapter.basic.ApiResult;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public interface ILoginForThirdAdapter {

    boolean support(Object object);

    ApiResult login(String username,Object adapter);

}
