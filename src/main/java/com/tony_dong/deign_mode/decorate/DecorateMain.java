package com.tony_dong.deign_mode.decorate;

/**
 * @Description 装饰器模式
 * 动态的给一个对象添加一些额外的功能。
 * 就增加功能来说，装饰模式比生成子类更为灵活。
 * JavaIO流大量使用装饰器设计模式
 * @Author Tony
 * @Date 2021/4/11
 */
public class DecorateMain {
    public static void main(String[] args) {
        Robot robot = new FirstRobot();
        robot.doSomething();

        // 在第一代机器人基础上扩展功能
        // 使用装饰器模式
        SecondRobot secondRobot = new SecondRobot(robot);
        secondRobot.doSomething();
        secondRobot.doOtherThing();
    }
}
