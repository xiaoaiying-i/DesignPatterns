package com.xiaoai.principle.RichterSubstitution;


/**
 里氏代换
 一个类被其他类所继承，该类修改时，必须考虑所有子类。父类修改后，所有子类有可能产生故障。
 如何正确使用继承？--》里氏替换原则

 使用基类的地方必须能透明使用子类对象。
 使用继承时，在子类中尽量不要重写父类方法。
 继承实际让两个类耦合性增强，在适当情况下可通过聚合，组合，依赖解决问题，不要通过继承。
 如某类子类需要改写父类方法，应把子类提升和父类一样的档次，把共同方法抽取，让子类和父类继承同一个更基层的基类。

 *若要改变父，就不要做父子关系了，做兄弟关系吧。
 *
 * 依赖传递：构造函数传递
 */
public class Client2 {//客户使用端
   public static void main(String[] args){
       IOpenAndCloseTv openAndCloseTv = new OpenAndCloseTv(new Changhong());
       openAndCloseTv.open();
   }

}

//开关接口
interface IOpenAndCloseTv{
    public void open();
}

//实现
class OpenAndCloseTv implements IOpenAndCloseTv{

    private ITV tv; // 成员变量

    public OpenAndCloseTv(ITV tv){
        this.tv = tv;
    }

    @Override
    public void open(){
        tv.play();
    }
}

//tv类型接口
interface ITV{
    public void play();
}
//定义不同tv类型
class Changhong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视打开。。。");
    }
}
class Kangjia implements ITV{
    @Override
    public void play() {
        System.out.println("康佳电视打开了。。。");
    }
}

