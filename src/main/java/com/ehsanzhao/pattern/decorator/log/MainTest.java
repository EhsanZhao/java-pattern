package com.ehsanzhao.pattern.decorator.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class MainTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(MainTest.class);
        logger = new JsonLogger(logger);
        logger.error("系统错误");
    }
}
