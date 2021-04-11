package com.tony_dong.deign_mode.status;

/**
 * @ClassName Person
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Person {
    private Status status;

    public Person(Status status){
        this.status = status;
    }

    public void changeStatus(Status status){
        this.status = status;
    }

    public void doWork(){
        this.status.doSomething();
    }
}
