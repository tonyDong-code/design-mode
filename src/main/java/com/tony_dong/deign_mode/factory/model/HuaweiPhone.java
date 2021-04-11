package com.tony_dong.deign_mode.factory.model;

/**
 * @ClassName HuaweiPhone
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class HuaweiPhone extends Phone{
    @Override
    public void describe() {
        System.out.println("我是华为手机");
    }
}
