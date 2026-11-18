package com.SpringBoot.StartingSpringBoot.DI;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component // this tells the IOC container to create a bean of Engine class and store it.
class Engine {
    private String engineType;

    public Engine() {
        this.engineType = "Diesel Engine";
    }

    //setter method
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    //PostConstruct - executed before the initialization of the bean
    @PostConstruct
    public void createEngine(){
        System.out.println("Engine Bean is Created");
    }

    @PreDestroy
    public void removeEngine(){
        System.out.println("Engine Bean is Destroyed");
    }

    //Start method
    public void start(){
        System.out.println(engineType + " Started....");
    }
}

@Component
public class Car {

    //field injection - not preferred
   // @Autowired
    private Engine engine;

    // construction injection - preferred in industry grade projects
    @Autowired // this tells the spring to create an object here from the bean which it has stored
    public Car(Engine engine){
        this.engine= engine;
    }

    //@Autowired //setter injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void carStart(){
        engine.start();
        System.out.println("Car Started...");
    }
}
