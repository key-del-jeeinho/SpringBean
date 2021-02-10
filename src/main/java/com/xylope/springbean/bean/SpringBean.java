package com.xylope.springbean.bean;

import lombok.Getter;
import lombok.Setter;

public class SpringBean {
    @Setter @Getter
    private String id;
    @Setter @Getter
    private String beanClass;
    @Setter @Getter
    private BeanScope scope;
}
