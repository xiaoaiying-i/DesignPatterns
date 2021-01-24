package com.xiaoai.decorator.decorator;

import com.xiaoai.decorator.NodeDecorator;
import com.xiaoai.decorator.TextNode;

/**
 *
 * 具体装饰器
 * @Author
 * @Date 2021-01-24 14:19
 */
public class UnderlineDecorator extends NodeDecorator {


    public UnderlineDecorator(TextNode target) {
        super(target);
    }

    public String getText() {
        return "<u>" + target.getText() + "</u>";
    }
}
