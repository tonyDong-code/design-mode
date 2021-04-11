package com.tony_dong.deign_mode.facade;

/**
 * @ClassName Filter
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Filter {
    private Condition c1 = new Condition1();
    private Condition c2 = new Condition2();
    private Condition c3 = new Condition3();

    public boolean filter(String msg){
        return c1.judge(msg) && c2.judge(msg) && c3.judge(msg);
    }
}
