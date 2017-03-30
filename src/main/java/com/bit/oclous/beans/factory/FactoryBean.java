package com.bit.oclous.beans.factory;

/**
 * Created by hzwangqiqing
 * on 2017/3/30.
 */
public interface FactoryBean <T>{
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
