package com.daili.service.factory;

import com.daili.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int num) {
        //目标方法
        System.out.println("目标类中执行Sell目标方法");
        return 85;
    }
}
