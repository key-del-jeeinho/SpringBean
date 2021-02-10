package com.xylope.springbean.applicationcontext;

import com.xylope.springbean.bean.SpringBean;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericApplicationContext implements ApplicationContext{
    protected static List<SpringBean> beans = new ArrayList<>();
}
