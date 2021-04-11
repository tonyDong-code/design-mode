package com.tony_dong.deign_mode.facade;

import org.apache.commons.lang3.StringUtils;


/**
 * @ClassName Condition2
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Condition2 implements Condition{
    @Override
    public boolean judge(String msg) {
        return StringUtils.contains(msg, "CHINA");
    }
}
