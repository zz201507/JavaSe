package com.daili.service.factory;

import com.daili.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int num) {
        //Ŀ�귽��
        System.out.println("Ŀ������ִ��SellĿ�귽��");
        return 85;
    }
}
