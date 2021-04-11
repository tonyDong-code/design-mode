package com.tony_dong.deign_mode.proxy;

/**
 * @ClassName Person
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Singer implements Singable {

    @Override
    public void sing() {
        System.out.println("唱一首光年之外送给大家");
    }
}
