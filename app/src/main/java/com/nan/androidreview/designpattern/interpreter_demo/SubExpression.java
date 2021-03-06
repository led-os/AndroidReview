package com.nan.androidreview.designpattern.interpreter_demo;

import java.util.HashMap;

/**
 * 减法
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return this.mLeft.interpreter(var) - this.mRight.interpreter(var);
    }
}
