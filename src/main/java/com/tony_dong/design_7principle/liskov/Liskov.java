package com.tony_dong.design_7principle.liskov;

/**
 * @ClassName Liskov
 * @Description TODO:历史替换原则
 * @Author Tony
 * @Date 2021/3/28
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3)); System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-----------------------");

        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出 11-3
        System.out.println("1-8=" + b.func1(1, 8));// 1-8 System.out.println("11+3+9=" + b.func2(11, 3));
    }
}
class A{
    // 返回两个数的差
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}
class B extends A {
    public int func1(int num1, int num2){
        return num1 + num2;
    }
    public int func2(int num1, int num2){
        return func1(num1, num2) + 9;
    }
}

