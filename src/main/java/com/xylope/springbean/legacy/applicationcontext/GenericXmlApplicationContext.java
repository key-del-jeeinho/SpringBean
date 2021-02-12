package com.xylope.springbean.legacy.applicationcontext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public class GenericXmlApplicationContext extends com.xylope.springbean.legacy.applicationcontext.GenericApplicationContext {
    String path;

    public GenericXmlApplicationContext(String path) {
        loadXmlData();
    }

    @Override
    public <T> T getBean(String id, Class<T> beanClass) {
        AtomicReference<T> result = new AtomicReference<>();
        beans.forEach(
                bean -> {
                    if(bean.getId().equals(id)) {
                        if (bean.getBeanClass().equals(beanClass.getName())) {
                            if (bean.getBeanObject() != null)
                                result.set((T) bean.getBeanObject());
                            else {
                                try {
                                    Constructor<T> cons = beanClass.getDeclaredConstructor();
                                    cons.setAccessible(true);

                                    bean.setBeanObject(cons.newInstance());
                                    result.set((T)bean.getBeanObject());
                                } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
        );
        return result.get(); //추후 beanClass 를 통한 리플렉션으로 불러올 예정
    }

    protected void loadXmlData() {

    }
}
