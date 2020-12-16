package com.chy.staticproxy2;

public class client {
    public static void main(String[] args) {

       UserServiceImpl userServiceImpl = new UserServiceImpl();
//        userServiceImpl.add();
        UserServiceProxy user = new UserServiceProxy();
        user.setUserService(userServiceImpl);
        user.add();

    }
}
