package com.SpringBoot.StartingSpringBoot.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Battery {
    private String batteryType;
   public Battery() {
        this.batteryType = "Lithium Battery";
       System.out.println("Battery created");
    }

    //setter method
    public void setBattery() {
        this.batteryType = batteryType;
    }

    public void installBattery(){
        System.out.println(batteryType+" Installed");
    }

}
@Component
public class SmartPhone {
    private Battery batteryType;

    @Autowired
    SmartPhone(Battery batteryType){
        this.batteryType = batteryType;
    }


    public void setBattery(Battery batteryType) {
        this.batteryType = batteryType;
    }

    public void switchOn(){
        batteryType.installBattery();
        System.out.println("Switching on the SmartPhone!");
    }
}
