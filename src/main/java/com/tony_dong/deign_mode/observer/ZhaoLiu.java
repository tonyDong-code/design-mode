package com.tony_dong.deign_mode.observer;

/**
 * @ClassName ZhaoLiu
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class ZhaoLiu implements Credit{
    @Override
    public void takeMoney() {
        System.out.println("赵六要钱");
    }
}
