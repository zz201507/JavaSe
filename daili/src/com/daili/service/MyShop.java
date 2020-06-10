package com.daili.service;

import com.daili.service.factory.UsbKingFactory;
import com.daili.service.handler.MySellHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyShop {
    public static void main(String[] args) {
        //�����������,ʹ��Proxy
        //1.����Ŀ�����
        UsbSell factory = new UsbKingFactory();

        //2.����InvocationHandler����
        InvocationHandler handler = new MySellHandler(factory);

        //3.�����������
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(
                factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler
        );

        System.out.println( proxy.sell(1));
    }
}
