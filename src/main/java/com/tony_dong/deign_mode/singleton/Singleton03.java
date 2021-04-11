package com.tony_dong.deign_mode.singleton;

/**
 * @Description 单例模式-懒汉式03：：只提供一个实例，当需要使用的时候，再加载类实例
 * @Author Tony
 * @Date 2021/4/11
 */
public class Singleton03 {

    //1. 提供类成员变量的实例引用
    private static volatile Singleton03 singleton;

    //2. 私有化构造器
    private Singleton03(){}

    //3. 提供公共的获取实例对象的方法
    public Singleton03 getInstance(){
        // 双重检查，保证多线程下不会创建多实例
        if (singleton == null){
            synchronized (Singleton03.class){
                if (singleton == null){
                    singleton = new Singleton03();
                }
            }
        }
        return  singleton;
    }
}
