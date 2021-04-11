package com.tony_dong.deign_mode.facade;

import java.util.Objects;

/**
 * @ClassName Condition1
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Condition1 implements Condition{
    @Override
    public boolean judge(String msg) {
        return Objects.nonNull(msg);
    }
}
