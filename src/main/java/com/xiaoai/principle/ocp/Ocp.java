package com.xiaoai.principle.ocp;

/**
 开闭原则：Open Closed Principle, OCP)
 最基础、最重要的设计原则
 一个实体如类、模块、函数应【扩展开发(对提供方)，修改关闭(对使用方)】。抽象构建框架，实现扩展细节。
 软件需变化，尽量通过扩展代码而不是修改已有代码。
 编程中遵循其他原则，及设计模式目的就是遵循开闭原则(核心)。
 */
public class Ocp {
    public static void main(String[] args){
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，调用draw方法
    public void drawShape(Shape s) {
        if (s.m_type == 1){
            drawRectangle();
        }else if (s.m_type == 2){
            drawCircle();
        }else if (s.m_type == 3){ //新增图形
            drawTriangle();
        }
    }
    public void drawRectangle(){
        System.out.println(" 绘制矩形 ");
    }
    public void drawCircle() {
        System.out.println(" 绘制圆形 ");
    }
    //新增图形
    public void drawTriangle() {
        System.out.println(" 绘制三角形 ");
    }

}

//定义各种图形
//Shape类，基类，
class Shape {
    int m_type;
}
//矩形
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}
//圆形
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
//新增三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}


