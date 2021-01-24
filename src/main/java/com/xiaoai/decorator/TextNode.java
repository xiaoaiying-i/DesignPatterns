package com.xiaoai.decorator;

/**
 * 待装饰的顶层接口
 */
public interface TextNode {
    // 设置text:
    void setText(String text);
    // 获取text:
    String getText();
}