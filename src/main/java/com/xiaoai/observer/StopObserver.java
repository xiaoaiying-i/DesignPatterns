package com.xiaoai.observer;

/**
 * @Author
 * @Date 2021-01-24 13:02
 */
public class StopObserver implements Observer{



    @Override
    public void update() {
        System.out.println("【StopObserver】收到消息，进行stop。。。。");
    }

}
