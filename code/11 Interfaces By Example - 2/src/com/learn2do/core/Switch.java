package com.learn2do.core;

public class Switch {
    private Appliance appliance;

    public Switch(Appliance appliance) {
        this.appliance = appliance;
    }

    public final void on(){
        appliance.connect();
    }

    public final void off() {
        appliance.disconnect();
    }
}
