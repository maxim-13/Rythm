package com.greenlaw110.rythm.internal.parser.toString;

import com.greenlaw110.rythm.internal.parser.CodeToken;
import com.greenlaw110.rythm.utils.TextBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: luog
 * Date: 15/07/12
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class AppendStartToken extends CodeToken {

    private static String getCode() {
        return "__style.appendStart(buffer(), _);";
    }

    public AppendStartToken(TextBuilder caller) {
        super(getCode(), caller);
    }
}
