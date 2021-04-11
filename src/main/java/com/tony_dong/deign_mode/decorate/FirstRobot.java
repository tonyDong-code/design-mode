package com.tony_dong.deign_mode.decorate;

/**
 * @ClassName FirstRobot
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class FirstRobot implements Robot{
    @Override
    public void doSomething() {
        System.out.println("我会唱歌和讲故事");
    }
}
