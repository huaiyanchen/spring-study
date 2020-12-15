package com.chy;

public class hello {
    private String getHello;

    public String getGetHello() {
        return getHello;
    }

    public void setGetHello(String getHello) {
        this.getHello = getHello;
    }

    @Override
    public String toString() {
        return "hello{" + "getHello='" + getHello + '\'' + '}';
    }
}
