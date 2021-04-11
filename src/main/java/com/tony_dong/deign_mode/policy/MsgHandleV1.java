package com.tony_dong.deign_mode.policy;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName MsgHandleV1
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class MsgHandleV1 implements Handlor{
    @Override
    public String handle(String msg) {
        return StringUtils.trim(msg);
    }
}
