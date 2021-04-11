package com.tony_dong.deign_mode.proxy;

/**
 * @ClassName Proxy
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Proxy implements Singable{
    private Singable singer;

    public Proxy() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        this.singer = (Singable) this.getClass().getClassLoader().loadClass("com.tony_dong.deign_mode.proxy.Singer").newInstance();
    }

    public void setSinger(Singable singer){
        this.singer = singer;
    }

    @Override
    public void sing() {
        sign();
        singer.sing();
        account();
    }

    public void sign(){
        System.out.println("我是经纪人，我在签合同");
    }

    public void account(){
        System.out.println("我是经纪人，我在算账");
    }
}
