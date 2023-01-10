package com.ehsanzhao.pattern.composite;

/**
 * @author zhaoyuan
 * @date 2023/1/10
 */
public class MainTest {
    public static void main(String[] args) {
        IMenu user = new MenuLeaf("用户管理");
        IMenu role = new MenuLeaf("角色管理");
        IMenu perssion = new MenuLeaf("菜单管理");
        MenuComponent sys = new MenuComponent("系统管理",2);
        sys.addChild(perssion);
        sys.addChild(role);
        sys.addChild(user);
        IMenu product = new MenuLeaf("产品管理");
        IMenu waybill = new MenuLeaf("物流管理");
        IMenu order = new MenuLeaf("订单管理");
        MenuComponent sell = new MenuComponent("销售管理",3);
        MenuComponent mall = new MenuComponent("商城管理",2);
        mall.addChild(sell);
        sell.addChild(order);
        sell.addChild(waybill);
        mall.addChild(product);
        MenuComponent paltment = new MenuComponent("xxx平台",1);
        paltment.addChild(mall);
        paltment.addChild(sys);
        paltment.show();
    }
}
