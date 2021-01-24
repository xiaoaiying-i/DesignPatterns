package com.xiaoai.decorator;

import com.xiaoai.decorator.TextNode;

/**
 * 抽象装饰器，即装饰器都拥有这些属性，所以统一定义一个抽象层
 */
public abstract class NodeDecorator implements TextNode {
    protected final TextNode target;

    protected NodeDecorator(TextNode target) {
        this.target = target;
    }

    public void setText(String text) {
        this.target.setText(text);
    }
}