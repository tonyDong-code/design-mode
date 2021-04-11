package com.tony_dong.deign_mode.factory;

import com.tony_dong.deign_mode.factory.abstract_factory.AbstractFactory;
import com.tony_dong.deign_mode.factory.abstract_factory.BJFactory;
import com.tony_dong.deign_mode.factory.abstract_factory.SHFactory;
import com.tony_dong.deign_mode.factory.factory.Factory;
import com.tony_dong.deign_mode.factory.factory.HuaweiFactory;
import com.tony_dong.deign_mode.factory.model.Mask;
import com.tony_dong.deign_mode.factory.model.Phone;
import com.tony_dong.deign_mode.factory.simple_factory.SimpleFactory;

/**
 * @Description
 * @Author Tony
 * @Date 2021/4/11
 */
public class FactoryMain {

    public static void main(String[] args) {
//        testSimpleFactory();
//        testFactory();
        testAbstractFactory();
    }

    /**
     * 简单工厂模式客户端
     */
    public static void testSimpleFactory(){
        Phone phone = new SimpleFactory().createPhone("Huawei");
        phone.describe();
    }

    public static void testFactory(){
        Factory factory = new HuaweiFactory();
        Phone phone = factory.createPhone();
        phone.describe();
    }

    public static void testAbstractFactory(){
        AbstractFactory bjFactory = new BJFactory();
        Phone phone = bjFactory.createPhone();
        Mask mask = bjFactory.createMask();
        phone.describe();
        mask.describe();

        AbstractFactory shFactory = new SHFactory();
        Phone phone1 = shFactory.createPhone();
        Mask mask1 = shFactory.createMask();
        phone1.describe();
        mask1.describe();

    }
}
