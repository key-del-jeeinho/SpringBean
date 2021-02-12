package com.xylope.springbean.legacy.applicationcontext;

public interface ApplicationContext {
    <T> T getBean(String name, Class<T> beanClass);
}
