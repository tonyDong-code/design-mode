package com.tony_dong.deign_mode.factory.factory;

import com.tony_dong.deign_mode.factory.model.HuaweiPhone;
import com.tony_dong.deign_mode.factory.model.Phone;

/**
 * @ClassName HuaweiFactory
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class HuaweiFactory extends Factory{
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
