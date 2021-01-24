package com.xiaoai.decorator.decorator;

import com.xiaoai.decorator.NodeDecorator;
import com.xiaoai.decorator.TextNode;

/**
 * 具体装饰器
 * @Author
 * @Date 2021-01-24 14:20
 */
public class ItalicDecorator extends NodeDecorator {

    public ItalicDecorator(TextNode target) {
        super(target);
    }

    public String getText() {
        return "<i>" + target.getText() + "</i>";
    }
}
