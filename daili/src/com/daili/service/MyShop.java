package com.daili.service;

import com.daili.service.factory.UsbKingFactory;
import com.daili.service.handler.MySellHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyShop {
    public static void main(String[] args) {
        //创建代理对象,使用Proxy
        //1.创建目标对象
        UsbSell factory = new UsbKingFactory();

        //2.创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);

        //3.创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(
                factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler
        );

        System.out.println( proxy.sell(1));
    }
}
