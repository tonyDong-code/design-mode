package com.tony_dong.deign_mode.singleton;

/**
 * @Description 单例模式-饿汉式02：只提供一个实例，随着类的加载而加载
 * @Author Tony
 * @Date 2021/4/11
 */
public class Singleton02 {

    // 在01的基础上，也可以使用静态代码块构造类实例
    private static Singleton02 singleton;

    // 2. 私有化类构造器，只能在类中进行构造
    private Singleton02(){}

    static {
        singleton = new Singleton02();
    }

    // 3. 提供公共的获取类实例的方法
    public Singleton02 getInstance(){
        return singleton;
    }
}
