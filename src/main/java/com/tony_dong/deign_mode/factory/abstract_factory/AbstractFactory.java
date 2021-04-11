package com.tony_dong.deign_mode.factory.abstract_factory;

import com.tony_dong.deign_mode.factory.model.Mask;
import com.tony_dong.deign_mode.factory.model.Phone;

public interface AbstractFactory {
    public abstract Phone createPhone();

    public abstract Mask createMask();
}
