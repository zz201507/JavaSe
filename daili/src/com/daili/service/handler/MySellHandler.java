package com.daili.service.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySellHandler implements InvocationHandler {
    private Object target = null;

    //��̬����Ŀ���ǻ�ģ���Ҫ�������
    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //����ʵ�ָýӿڣ���ɴ��������Ĺ���
        /*
            1.����Ŀ�귽��
            2.������ǿ
         */
        Object res = method.invoke(target,args);   //ִ��Ŀ�귽��

        if (res!=null){
            float price = (float)res;
            price = price+25;
            res = price;
        }
        return res;
    }
}
