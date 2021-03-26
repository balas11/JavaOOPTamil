package com.learn2do.devices;

import com.learn2do.core.Appliance;

public class Fan extends Appliance {
    @Override
    protected void connect() {
        System.out.println("I am spinning...");
    }

    @Override
    protected void disconnect() {
        System.out.println("I have stopped!");
    }
}
