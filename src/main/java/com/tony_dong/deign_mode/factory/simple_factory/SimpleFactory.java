package com.tony_dong.deign_mode.factory.simple_factory;

import com.tony_dong.deign_mode.factory.model.HuaweiPhone;
import com.tony_dong.deign_mode.factory.model.MiPhone;
import com.tony_dong.deign_mode.factory.model.Phone;

/**
 * @Description 简单工厂模式
 * 简单工厂模式，又称为静态工厂方法模式，属于类创建型模式。
 * 在简单工厂模式中，可以根据参数不同返回不同类的实例。
 * 简单工厂模式专门定义一个类负责创建其他类的实例，被创建的实例通常都有共同的父类。
 * 简单工厂模式，一般是用来创建同一大类下的某一类产品的实例的类。
 * Dateformat类中使用了简单工厂模式
 * @Author Tony
 * @Date 2021/4/11
 */
public class SimpleFactory {

    // 1. 提供创造类实例的方法
    public Phone createPhone(String phoneType){
        if ("Huawei".equals(phoneType))
            return new HuaweiPhone();
        else
            return new MiPhone();
    }
}
