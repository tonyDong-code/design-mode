package com.tony_dong.deign_mode.adapter;

/**
 * @ClassName Adapter
 * @Description TODO:
 * @Author Tony
 * @Date 2021/4/11
 */
public class Adapter implements Translate{

    private Speaker speaker;

    public Adapter(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        String words = speaker.speak();
        return words.toUpperCase();
    }
}
