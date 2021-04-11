package com.tony_dong.deign_mode.policy;


/**
 * @ClassName Processor
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Processor {
    public String process(String msg, Handlor handlor){
        return handlor.handle(msg);
    }
}
