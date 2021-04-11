package com.tony_dong.deign_mode.observer;

/**
 * @Description 观察者模式
 * 定义对象间的一种一对多依赖关系，是的每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新
 * @Author Tony
 * @Date 2021/4/11
 */
public class ObserverMain {
    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        zhangSan.brownMoney(new WangWu());
        zhangSan.brownMoney(new ZhaoLiu());

        // 张三状态改变了，有钱了，要还钱了
        zhangSan.notifyCredits();
    }
}
