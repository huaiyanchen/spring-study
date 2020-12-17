package com.chy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Landlord landlord = new Landlord();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(landlord);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
