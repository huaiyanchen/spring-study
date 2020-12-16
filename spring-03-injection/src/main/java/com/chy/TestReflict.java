package com.chy;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.Class.*;

public class TestReflict {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Address address = new Address();

        Class aClass = Address.class;
        Class a = address.getClass();
        Class clazz = Class.forName("com.chy.TestReflict$Address");
        /**
         * 通過反射获取方法
         */
//        Address address1 = (Address) clazz.newInstance();
//        Method m = a.getDeclaredMethod("setAddress", String.class);
//        m.invoke(address1, "Peking");
//        System.out.println(address1.getAddress());
        /**
         * 通过反射获取属性
         */

        Address address2 = (Address) clazz.newInstance();
        Field file = clazz.getDeclaredField("address");
        /**
         *不能直接操作私有属性，要用
         * file.setAccessible(true);
         */
        file.setAccessible(true);
        file.set(address2, "beijing");
        System.out.println(address2.getAddress());

    }

    static class Address {
        private String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "address='" + address + '\'' +
                    '}';
        }

    }
}
