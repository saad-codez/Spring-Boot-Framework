package com.SpringBoot.StartingSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;

    @Autowired // this tells the spring to create an object here from the bean which it has stored
    public Car(Engine engine){
        this.engine= engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void carStart(){
        engine.start();
        System.out.println("Car Started...");
    }
}
