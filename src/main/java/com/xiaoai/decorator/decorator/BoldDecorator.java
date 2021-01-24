package com.xiaoai.decorator.decorator;

import com.xiaoai.decorator.NodeDecorator;
import com.xiaoai.decorator.TextNode;

/**
 * 具体装饰器
 */
public class BoldDecorator extends NodeDecorator {
    public BoldDecorator(TextNode target) {
        super(target);
    }

    // 装饰内容不同，所以在每个具体装饰器中完成具体装饰内容。
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}