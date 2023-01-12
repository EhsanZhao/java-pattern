package com.ehsanzhao.pattern.bridge;

import lombok.Data;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
@Data
public abstract class ExpressGrade {

    private IExpress express;

    public ExpressGrade(IExpress express) {
        this.express = express;
    }

    public void setGrade(String message){
        this.express.sendExpress(message);
    };
}
