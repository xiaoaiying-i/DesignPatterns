package com.xiaoai.decorator;

import com.xiaoai.decorator.decorator.BoldDecorator;
import com.xiaoai.decorator.decorator.ItalicDecorator;
import com.xiaoai.decorator.decorator.UnderlineDecorator;

/**
 * @Author
 * @Date 2021-01-24 14:18
 */
public class Client {
    
    public static void main(String[] args){
        TextNode n1 = new SpanNode();

        TextNode n2 = new BoldDecorator(new UnderlineDecorator(n1)); // 装饰1
        TextNode n3 = new ItalicDecorator(new BoldDecorator(n1)); // 装饰2
        TextNode n4 = new BoldDecorator(new UnderlineDecorator(new ItalicDecorator(n1))); // 装饰3

        // 如果使用的是同一个待装饰的物品，无论哪个装饰器设置的数据都是设置的同一个，所以会得到最后设置的数据 即：World
        // 如果需要不同设置就需要用不同的待装饰的物品
        n1.setText("Hello");
        n2.setText("Decorated");
        n3.setText("World");

        System.out.println(n1.getText());// 输出<span>Hello</span>
        System.out.println(n2.getText()); // 输出<b><u><span>Decorated</span></u></b>
        System.out.println(n3.getText()); // 输出<i><b><span>World</span></b></i>

        System.out.println(n4.getText()); //<b><u><i><span>World</span></i></u></b>


    }
}
