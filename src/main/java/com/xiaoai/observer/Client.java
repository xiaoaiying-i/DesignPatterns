package com.xiaoai.observer;

/**
 * 观察者模式
 * 应用演示
 */
public class Client {

    public static void main(String[] args) {
        //创建一个主题
        ConcreteSubject subject = new ConcreteSubject();
        //定义观察者
        Observer observer = new ConcreteObserver();
        Observer stopObserver = new StopObserver();

        //添加观察者
        subject.addObserver(observer);
        subject.addObserver(stopObserver);

        //主题进行活动
        subject.doSomething();




    }

}