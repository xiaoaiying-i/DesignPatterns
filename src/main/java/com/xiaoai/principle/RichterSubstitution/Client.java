//package com.xiaoai.p1_principle.RichterSubstitution;
//
/**
 * 依赖传递：接口传递
 */
//public class Client { //客户使用端
//   public static void main(String[] args){
//       IOpenAndCloseTv openAndCloseTv = new OpenAndCloseTv();
//       openAndCloseTv.open(new Changhong());
//       openAndCloseTv.open(new Kangjia());
//   }
//
//}
//
////开关接口
//interface IOpenAndCloseTv{
//    public void open(ITV tv);
//}
////实现
//class OpenAndCloseTv implements IOpenAndCloseTv{
//    @Override
//    public void open(ITV tv) {
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
