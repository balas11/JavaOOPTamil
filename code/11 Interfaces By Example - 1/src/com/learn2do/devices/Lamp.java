package com.learn2do.devices;

import com.learn2do.core.Appliance;

public class Lamp extends Appliance {
    @Override
    protected void connect() {
        System.out.println("I am glowing...");
    }

    @Override
    protected void disconnect() {
        System.out.println("I am dark!");
    }
}
