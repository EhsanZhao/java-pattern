package com.ehsanzhao.pattern.decorator.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class JsonLoggerFactory {

    public static Logger getLogger(Class<?> clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        logger = new JsonLogger(logger);
        return logger;

    }

}
