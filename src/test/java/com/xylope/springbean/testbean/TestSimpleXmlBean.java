package com.xylope.springbean.testbean;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class TestSimpleXmlBean {
    @Setter
    String message;

    public TestSimpleXmlBean() {
        this.message = "@NoArgsConstructor";
    }

    @Override
    public String toString() {
        return message;
    }
}
