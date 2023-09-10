package com.geekster.Api_and_Mail_Integration;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean("Name1")
    public Students getStudentsObject1(){
        System.out.println("Inside bean method getStudentsObject1" );
        return new Students("Rahul");
    }

    @Bean("Name2")
    public Students getStudentsObject2(){
        System.out.println("Inside bean method getStudentsObject2" );
        return new Students("Neha");
    }
}
