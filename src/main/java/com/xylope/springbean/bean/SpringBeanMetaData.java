package com.xylope.springbean.bean;

import java.util.List;

public class SpringBeanMetaData {
    String id;
    String clazz;
    Scope scope;
    String initMethod;
    String destroyMethod;
    List<SpringBeanMetaData> property;
}
