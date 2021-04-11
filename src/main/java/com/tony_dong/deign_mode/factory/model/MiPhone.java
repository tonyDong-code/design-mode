package com.tony_dong.deign_mode.factory.model;

/**
 * @ClassName MiPhone
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class MiPhone extends Phone{
    @Override
    public void describe() {
        System.out.println("我是小米手机");
    }
}
