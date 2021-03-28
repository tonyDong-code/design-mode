package com.tony_dong.design_7principle.singleresponsibility;

/**
 * @ClassName SingleResponsibility3
 * @Description TODO:
 * @Author Tony
 * @Date 2021/3/28
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("汽车");
        vehicle3.run("飞机");
        vehicle3.run("轮船");
    }
}

/**
 * 1. 这种修改方法没有对原来的类做大的修改，只是增肌方法
 * 2. 这里虽然没有在类级别上做到单一职责原则，但是在方法上，遵守单一职责原则
 */
class Vehicle3{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑！");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天上飞！");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水上漂！");
    }
}

