package com.xylope.springbean.legacy.bean;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class SpringBean {
    @Setter @Getter @NonNull
    private String id;
    @Setter @Getter
    private String beanClass;
    @Setter @Getter @NonNull
    private BeanScope scope;
    @Setter @Getter
    private Object beanObject;

    private SpringBean() {
        this.scope = BeanScope.SINGLETON;
    }
    public SpringBean(String id, Object beanObject) {
        this();
        this.id = id;
        this.beanObject = beanObject;
    }
}
