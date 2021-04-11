package com.tony_dong.deign_mode.factory.factory;

import com.tony_dong.deign_mode.factory.model.Phone;

/**
 * @Description 工厂模式
 * 定义一个用于创建对象的接口，让子类决定实例化哪个类。
 * 工厂方法使一个类的实例化延迟到其子类。
 * Collection中使用了工厂方法模式。
 * @Author Tony
 * @Date 2021/4/11
 */
public abstract class Factory {

    public abstract Phone createPhone();
}
