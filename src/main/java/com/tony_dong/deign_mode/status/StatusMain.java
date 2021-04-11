package com.tony_dong.deign_mode.status;

/**
 * @Description 状态模式
 * 允许一个对象在其内部状态改变时，改变他的行为，对象看起来似乎修改了他的类。
 * 其别名位状态对象，状态模式是一种对象行为型模式
 * @Author Tony
 * @Date 2021/4/11
 */
public class StatusMain {

    public static void main(String[] args) {
        Person person = new Person(new Happy());
        person.doWork();

        person.changeStatus(new Sad());
        person.doWork();
    }
}
