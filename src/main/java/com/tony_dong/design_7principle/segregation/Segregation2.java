package com.tony_dong.design_7principle.segregation;

/**
 * @ClassName Segregation2
 * @Description TODO:接口隔离原则
 * 方案2
 * @Author Tony
 * @Date 2021/3/28
 */
public class Segregation2 {

    public static void main(String[] args) {
        A2 a = new A2();
        a.depend1(new B2()); // A 类通过接口去依赖 B 类
        a.depend2(new B2());
        a.depend3(new B2());
        C2 c = new C2();
        c.depend1(new D2()); // C 类通过接口去依赖(使用)D 类
        c.depend4(new D2());
        c.depend5(new D2());
    }
}
interface I1 {
    void operation1();
}
interface I2 {
    void operation2();
    void operation3();
}
interface I3 {
    void operation4();
    void operation5();
}
class B2 implements I1, I2 {
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}
class D2 implements I1, I3 {
    public void operation1() {
        System.out.println("D 实现了  operation1");
    }
    public void  operation4()  {
        System.out.println("D 实现了  operation4");
    }
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
class A2 {
    // A 类通过接口 Interface1,Interface2 依赖(使用) B 类，但是只会用到 1,2,3 方法
    public void depend1(I1 i) {
        i.operation1();
    }
    public void depend2(I2 i) {
        i.operation2();
    }
    public void depend3(I2 i) {
        i.operation3();
    }
}

class C2 {
    // C  类通过接口 Interface1,Interface3  依赖(使用) D 类，但是只会用到 1,4,5 方法
    public void depend1(I1 i) {
        i.operation1();
    }
    public void depend4(I3 i) {
        i.operation4();
    }
    public void depend5(I3 i) {
        i.operation5();
    }
}