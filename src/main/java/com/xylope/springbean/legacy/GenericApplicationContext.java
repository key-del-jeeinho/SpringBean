package com.xylope.springbean.legacy.applicationcontext;

import com.xylope.springbean.legacy.bean.SpringBean;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericApplicationContext implements ApplicationContext{
    protected static List<SpringBean> beans = new ArrayList<>();
}
