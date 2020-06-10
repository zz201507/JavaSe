package com.daili.service.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySellHandler implements InvocationHandler {
    private Object target = null;

    //动态代理：目标是活动的，需要传入进来
    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //必须实现该接口，完成代理类做的功能
        /*
            1.调用目标方法
            2.功能增强
         */
        Object res = method.invoke(target,args);   //执行目标方法

        if (res!=null){
            float price = (float)res;
            price = price+25;
            res = price;
        }
        return res;
    }
}
