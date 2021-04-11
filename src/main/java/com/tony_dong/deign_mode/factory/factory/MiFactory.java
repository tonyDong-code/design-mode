package com.tony_dong.deign_mode.factory.factory;

import com.tony_dong.deign_mode.factory.model.MiPhone;
import com.tony_dong.deign_mode.factory.model.Phone;

/**
 * @ClassName MiFactory
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class MiFactory extends Factory{
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
