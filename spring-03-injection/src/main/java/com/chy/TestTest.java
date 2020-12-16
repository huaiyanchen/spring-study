package com.chy;

public class TestTest {
    static {
        System.out.println("main初始化");
    }

    public static void main(String[] args) {
        //Son son = new Son();
        System.out.println(Son.b);
        // System.out.println(Son.m);
        // System.out.println(Son.c);
        //Son[] a = new Son[5];
    }
}

class Father {

    static int b = 1;

    static {
        System.out.println("父类初始化");
        // int m = 100;
    }
}

class Son extends Father {
    static {
        System.out.println("子类初始化");
        int m = 100;
    }

    static int m = 300;
    static final int c = 10;
}