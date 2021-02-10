package com.xylope.springbean.applicationcontext;

public class GenericXmlApplicationContext implements ApplicationContext{
    String path;

    public GenericXmlApplicationContext(String path) {
        loadXmlData();
    }

    @Override
    public <T> T getBean(String id, Class<T> beanClass) {
        return null; //추후 beanClass 를 통한 리플렉션으로 불러올 예정
    }

    protected void loadXmlData() {

    }
}
