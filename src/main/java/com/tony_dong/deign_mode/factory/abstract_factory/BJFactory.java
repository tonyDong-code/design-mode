package com.tony_dong.deign_mode.factory.abstract_factory;

import com.tony_dong.deign_mode.factory.model.Mask;
import com.tony_dong.deign_mode.factory.model.MiPhone;
import com.tony_dong.deign_mode.factory.model.N95;
import com.tony_dong.deign_mode.factory.model.Phone;

/**
 * @ClassName BJFactory
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class BJFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Mask createMask() {
        return new N95();
    }
}
