package com.hls.beans;

public class WeChatPay implements Pay {

    @Override
    public void pay() {
        System.out.println("微信。。。。");
    }
}
