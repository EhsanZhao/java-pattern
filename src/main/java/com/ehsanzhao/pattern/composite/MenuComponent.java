package com.ehsanzhao.pattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyuan
 * @date 2023/1/10
 */
public class MenuComponent extends IMenu{

    private List<IMenu> list;

    {
        list = new ArrayList<>();
    }

    private Integer level;

    public MenuComponent(String name,Integer level) {
        super(name);
        this.level = level;
    }

    public boolean addChild(IMenu menu){
        return this.list.add(menu);
    }

    public boolean removeChild(IMenu menu){
        return this.list.remove(menu);
    }

    public IMenu getChild(int index){
        return this.list.get(index);
    }

    @Override
    public void show() {
        System.out.println(super.getName());
        for (IMenu menu : list) {
            if(this.level!=null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("--");
                }
            }
            menu.show();
        }
    }
}
