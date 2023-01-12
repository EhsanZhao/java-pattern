package com.ehsanzhao.pattern.bridge;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
public class MainTest {

    public static void main(String[] args) {
        IExpress shunfeng = new ShunFengExpress();
        ExpressGrade normal = new NormalExpress(shunfeng);
        normal.setGrade("《冰雪王国》1本");

        IExpress yunda = new YunDaExpress();
        ExpressGrade urgent = new UrgentExpress(yunda);
        urgent.setGrade("《摄影师》1本");

    }

}
