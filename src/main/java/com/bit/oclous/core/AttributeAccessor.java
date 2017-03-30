package com.bit.oclous.core;

/**
 * Created by hzwangqiqing
 * on 2017/3/30.
 */
public interface AttributeAccessor {
    void setAttribute(String name, Object value);

    Object getAttribute(String name);

    Object removeAttribute(String name);

    boolean hasAttribute(String name);

    String[] attributeNames();
}
