package com.tony_dong.deign_mode.status;

/**
 * @ClassName Happy
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Happy implements Status {
    @Override
    public void doSomething() {
        System.out.println("开心，努力干活！");
    }
}
