package com.chy;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MyConfig {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
