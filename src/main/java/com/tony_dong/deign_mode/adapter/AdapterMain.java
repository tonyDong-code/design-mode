package com.tony_dong.deign_mode.adapter;

/**
 * @Description 适配器模式
 * 将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
 * @Author Tony
 * @Date 2021/4/11
 */
public class AdapterMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        String words = speaker.speak();
        System.out.println(words);

        // 适配
        String newWords = new Adapter(speaker).translate();
        System.out.println(newWords);
    }
}
