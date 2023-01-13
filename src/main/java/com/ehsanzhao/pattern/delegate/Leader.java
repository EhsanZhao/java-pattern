package com.ehsanzhao.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoyuan
 * @date 2023/1/13
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> library;

    {
        library = new HashMap<>();
        library.put("画图",new EmployeeA());
        library.put("造房子",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(library.containsKey(task)){
            library.get(task).doing(task);
        }else{
            System.out.println("我做不了");
        }
    }
}
