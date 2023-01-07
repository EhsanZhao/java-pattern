package com.ehsanzhao.pattern.decorator.log;

import com.alibaba.fastjson2.JSONObject;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class JsonLogger extends LoggerDecorator {

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void error(String message) {
        JSONObject jsonObject = new JSONObject(){{
            put("message", message);
        }};
        logger.error(jsonObject.toString());
    }
}
