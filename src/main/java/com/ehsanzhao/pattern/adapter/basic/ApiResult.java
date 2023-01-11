package com.ehsanzhao.pattern.adapter.basic;

import lombok.Data;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
@Data
public class ApiResult {

    private Integer code;

    private String msg;

    private Object data;

    public ApiResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
