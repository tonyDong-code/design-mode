package com.tony_dong.deign_mode.observer;

/**
 * @ClassName WangWu
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class WangWu implements Credit{
    @Override
    public void takeMoney() {
        System.out.println("王五要钱");
    }
}
