package com.tony_dong.deign_mode.decorate;

/**
 * @ClassName SecondRobot
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class SecondRobot implements Robot{

    private Robot robot;

    public SecondRobot(Robot robot){
        this.robot = robot;
    }


    @Override
    public void doSomething() {
        this.robot.doSomething();
    }

    public void doOtherThing(){
        System.out.println("我还会跳舞和拖地");
    }
}
