package com.tony_dong.design_7principle.singleresponsibility;

/**
 * @ClassName SingleResponsbility1
 * @Description TODO:
 * @Author Tony
 * @Date 2021/3/28
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");
        vehicle.run("汽车");
    }

}

/**
 * 交通工具类
 * 方式1：
 * 1. 在方式1的run方法中违反了单一职责原则
 * 2. 解决：根绝交通工具的运行方式不同，分解成不同的类
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行！");
    }
}
