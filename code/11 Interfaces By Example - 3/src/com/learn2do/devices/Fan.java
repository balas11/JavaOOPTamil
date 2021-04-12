package com.learn2do.devices;

import com.learn2do.core.Appliance;

public class Fan implements Appliance {
    @Override
    public void connect() {
        System.out.println("I am spinning...");
    }

    @Override
    public void disconnect() {
        System.out.println("I have stopped!");
    }
}
