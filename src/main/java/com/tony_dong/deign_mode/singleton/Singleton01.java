package com.tony_dong.deign_mode.singleton;

/**
 * @Description 单例模式-饿汉式01：只提供一个实例，随着类的加载而加载
 * @Author Tony
 * @Date 2021/4/11
 */
public class Singleton01 {
    // 1. 提供类成员变量的对象实例, 随着类加载而加载
    private static final Singleton01 singleton = new Singleton01();

    // 2. 私有化类构造器，只能在类中进行构造
    private Singleton01(){}

    // 3. 提供公共的获取类实例的方法
    public Singleton01 getInstance(){
        return singleton;
    }
}
