package com.tony_dong.deign_mode.status;

/**
 * @ClassName Sad
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Sad implements Status{
    @Override
    public void doSomething() {
        System.out.println("难过，啥也不干！");
    }
}
