package com.xiaoai.decorator;

import com.xiaoai.decorator.TextNode;

/**
 * 具体待装饰类
 */
public class SpanNode implements TextNode {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return "<span>" + text + "</span>";
    }
}