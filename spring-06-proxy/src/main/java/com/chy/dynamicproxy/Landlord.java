package com.chy.dynamicproxy;


//真实角色
public class Landlord implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
