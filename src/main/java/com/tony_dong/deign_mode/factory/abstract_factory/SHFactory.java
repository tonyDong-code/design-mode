package com.tony_dong.deign_mode.factory.abstract_factory;

import com.tony_dong.deign_mode.factory.model.CommonMask;
import com.tony_dong.deign_mode.factory.model.HuaweiPhone;
import com.tony_dong.deign_mode.factory.model.Mask;
import com.tony_dong.deign_mode.factory.model.Phone;

/**
 * @ClassName SHFactory
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class SHFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Mask createMask() {
        return new CommonMask();
    }
}
