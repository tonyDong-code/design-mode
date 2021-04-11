package com.tony_dong.deign_mode.proxy;

/**
 * @Description 代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问
 * @Author Tony
 * @Date 2021/4/11
 */
public class ProxyMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Proxy proxy = new Proxy();
        proxy.sing();

        Singer singer = new Singer();
        proxy.setSinger(singer);
        proxy.sing();

    }
}
