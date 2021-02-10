package com.xylope.springbean.applicationcontext;

public interface ApplicationContext {
    <T> T getBean(String name, Class<T> beanClass);
}
