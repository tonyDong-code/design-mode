package com.tony_dong.deign_mode.observer;

public interface Debit {
    public abstract void brownMoney(Credit credit);

    public abstract void notifyCredits();
}
