package com.xiaoai.observer;

/**
 * 具体主题
 */
public class ConcreteSubject extends Subject {

    //具体业务
    public void doSomething() {

        // 处理完业务，通知观察者们
        System.out.println("【ConcreteSubject】更新了主题，通知观察者们。。。");
        super.notifyObserver();
    }

}