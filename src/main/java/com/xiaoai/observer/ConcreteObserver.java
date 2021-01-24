package com.xiaoai.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {


    /**
     * 观察者观察到变化后进行处理。
     */
    @Override
    public void update() {
        System.out.println("【ConcreteObserver】收到消息，进行处理。。。。");
    }

}