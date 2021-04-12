package com.learn2do.devices;

import com.learn2do.core.Appliance;

public class Lamp implements Appliance {
    @Override
    public void connect() {
        System.out.println("I am glowing...");
    }

    @Override
    public void disconnect() {
        System.out.println("I am dark!");
    }
}
