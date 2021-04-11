package com.tony_dong.deign_mode.facade;

/**
 * @Description 外观模式
 * 隐藏系统复杂性，提供对外的统一的接口方法，不满足开闭原则
 * @Author Tony
 * @Date 2021/4/11
 */
public class FacadeMain {
    public static void main(String[] args) {

        String msg = "ILOVECHINA";
        String msg1 = "I love CHINA";
        Filter filter = new Filter();
        System.out.println("msg: " + filter.filter(msg));
        System.out.println("msg1: " + filter.filter(msg1));

    }
}
