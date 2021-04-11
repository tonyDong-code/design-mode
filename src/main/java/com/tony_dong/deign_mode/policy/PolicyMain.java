package com.tony_dong.deign_mode.policy;

/**
 * @Description 策略模式
 * 定义一组算法，将每个算法都封装起来，并使他们之间可以互换。
 * 策略模式让算法独立于使用它的客户而变化，也成为政策模式。
 * @Author Tony
 * @Date 2021/4/11
 */
public class PolicyMain {

    public static void main(String[] args) {
        String msg = "  hello world  ";
        String p1 = new Processor().process(msg, new MsgHandleV1());
        System.out.println("v1: " + p1);

        String p2 = new Processor().process(msg, new MsgHandleV2());
        System.out.println("v2: " + p2);
    }
}
