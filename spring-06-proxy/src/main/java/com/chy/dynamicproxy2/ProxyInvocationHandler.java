package com.chy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object obj;

    public void setObj(Object obj) {

        this.obj = obj;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        return result;
    }
}
