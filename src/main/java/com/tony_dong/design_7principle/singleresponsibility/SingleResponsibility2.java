package com.tony_dong.design_7principle.singleresponsibility;

/**
 * @ClassName SingleResponsibility2
 * @Description TODO:
 * @Author Tony
 * @Date 2021/3/28
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 1. 遵守单一职责原则
 * 2. 但是这样做改动非常大，即将类分解，同时需要修改客户端
 * 3. 改进：直接修改Vehicle类，改动的代码会比较小=> 方案3
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑！");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞！");
    }
}
