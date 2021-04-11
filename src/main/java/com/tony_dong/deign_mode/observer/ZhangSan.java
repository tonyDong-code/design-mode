package com.tony_dong.deign_mode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ZhangSan
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class ZhangSan implements Debit{
    private List<Credit> credits = new ArrayList<>();

    @Override
    public void brownMoney(Credit credit) {
        credits.add(credit);
    }

    @Override
    public void notifyCredits() {
        credits.forEach(Credit::takeMoney);
    }
}
