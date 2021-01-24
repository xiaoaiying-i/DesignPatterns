package com.xiaoai.principle.DependenceReversal;


/**
 * 依赖逆转
 *
 * 底层模块尽量使用抽象类或接口，或两者都有，程序稳定性更好
 * 变量声明类型尽量用抽象类或接口。这样变量引用和实际对象存在一个缓冲层(即接口)，利用程序扩展和优化。
 * 继承时遵循里氏替换原则
 */
public class Liskov2 {
    public static void main(String[] args){

        A a = new A();
        System.out.println("11-3="+ a.func1(11,3));
        System.out.println("1-8="+ a.func1(1,8));

        System.out.println("----------------------------");
        B b = new B();
        System.out.println("11+3="+ b.func1(11,3)); // 这里其实已经覆写父类方法了，所以-的话是错误的。
        System.out.println("1+8="+ b.func1(1,8));
        System.out.println("11+3+9="+ b.func2(11,3));

        System.out.println("11-3="+ b.func3(11,3)); //实际调用的是A类的方法。
    }
}
class base{
    //共有的更基础的方法、成员变量定义到该类
    public int funcMult(int num1,int num2){
        return num1*num2;
    }
}
class A extends base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}
class B extends base{
    private A  aobj = new A(); //通过组合方式

    public int func1(int a,int b){
        return a + b;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
    public int func3(int a,int b){
        return aobj.func1(a,b);
    }
}