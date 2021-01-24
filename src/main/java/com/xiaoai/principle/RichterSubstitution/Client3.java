//package com.xiaoai.p1_principle.RichterSubstitution;//package com.xiaoai.p1_principle.RichterSubstitution;
//
////客户使用端
//
///**
// * 依赖传递：通过setter方法注入依赖
// */
//public class Client3 {
//   public static void main(String[] args){
//       IOpenAndCloseTv openAndCloseTv = new OpenAndCloseTv();
//       openAndCloseTv.setTv(new Changhong());
//       openAndCloseTv.open();
//   }
//
//}
//
////开关接口
//interface IOpenAndCloseTv{
//    public void open();
//    public void setTv(ITV tv);
//}
////实现
//class OpenAndCloseTv implements IOpenAndCloseTv{
//    private ITV tv; // 成员变量
//
//    @Override
//    public void setTv(ITV tv){
//        this.tv = tv;
//    }
//    @Override
//    public void open() {
//        tv.play();
//    }
//}
//
//
////tv类型接口
//interface ITV{
//    public void play();
//}
////定义不同tv类型
//class Changhong implements ITV{
//    @Override
//    public void play() {
//        System.out.println("长虹电视打开。。。");
//    }
//}
//class Kangjia implements ITV{
//    @Override
//    public void play() {
//        System.out.println("康佳电视打开了。。。");
//    }
//}
//
