package com.SpringBoot.StartingSpringBoot;

import org.springframework.stereotype.Component;

@Component // this tells the IOC container to create a bean of Engine class and store it.
public class Engine {
    private String engineType;

    public Engine() {
        this.engineType = "Diesel Engine";
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void start(){
        System.out.println(engineType + " Started....");
    }
}
