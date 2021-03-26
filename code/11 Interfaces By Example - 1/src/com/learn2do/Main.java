package com.learn2do;

import com.learn2do.core.Appliance;
import com.learn2do.devices.Fan;
import com.learn2do.devices.Lamp;

public class Main {

    public static void main(String[] args) {
        Appliance app1 = new Lamp();
        Appliance app2 = new Fan();
        app1.on();
        app2.on();
        delay(3);
        app1.off();
        delay(2);
        app2.off();
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
