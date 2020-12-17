package com.chy.dynamicproxy2;

import com.chy.staticproxy2.UserService;
import com.chy.staticproxy2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setObj(userService);
        UserService proxy =(UserService) proxyInvocationHandler.getProxy();
        proxy.add();

    }

}
