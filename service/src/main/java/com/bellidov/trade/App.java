package com.bellidov.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bellidov.trade"})
class App
{
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}