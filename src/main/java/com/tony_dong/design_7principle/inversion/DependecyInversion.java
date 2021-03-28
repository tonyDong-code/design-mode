package com.tony_dong.design_7principle.inversion;

/**
 * @ClassName DependecyInversion
 * @Description TODO:依赖倒转原则
 * @Author Tony
 * @Date 2021/3/28
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receive(email);
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello world！";
    }
}
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
