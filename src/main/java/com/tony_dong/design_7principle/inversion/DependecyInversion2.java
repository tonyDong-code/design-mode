package com.tony_dong.design_7principle.inversion;

/**
 * @ClassName DependecyInversion2
 * @Description TODO:依赖倒转原则-方案2
 * @Author Tony
 * @Date 2021/3/28
 */
public class DependecyInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());
        // 扩展接收微信的功能
        person.receive(new WeiXin());
    }
}
class Person2{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
interface IReceiver{
    public String getInfo();
}
class Email2 implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息是：Hello World！";
    }
}
class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "微信信息是：hello girl！";
    }
}
