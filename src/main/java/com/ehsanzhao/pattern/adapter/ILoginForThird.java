package com.ehsanzhao.pattern.adapter;

import com.ehsanzhao.pattern.adapter.basic.ApiResult;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
public interface ILoginForThird {

    ApiResult loginForQQ(String openId);

    ApiResult loginForWechat(String openId);

    ApiResult loginForToken(String openId);

    ApiResult loginForMobile(String mobile, String code);

}
