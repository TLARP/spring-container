/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.bit.oclous.beans.factory;

import com.bit.oclous.core.ResolvableType;

/**
 * @author 15652360845@163.com
 * @since 2017-3-30
 */
public interface BeanFactory {
    /**
     * {@link FactoryBean}
     * 区分普通bean和工厂bean
     */
    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String name) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(Class<T> requiredType, Object... args) throws BeansException;

    boolean containsBean(String name);

    /*
     *判断是否是单例
     */
    boolean isSingleton(String name) throws NoSuchBeanDefinitionException;

    /*
     *判断是否是多例
     */
    boolean isPrototype(String name) throws NoSuchBeanDefinitionException;

    /*
     *判断是否类型匹配
     */
    boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;

    /*
     *判断某个bean是否是指定类型
     */
    boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException;

    /*
     *获取bean的类型
     */
    Class<?> getType(String name) throws NoSuchBeanDefinitionException;

    /*
     *获取bean的别名
     */
    String[] getAliases(String name);
}
