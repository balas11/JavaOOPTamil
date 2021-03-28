package com.learn2do;

import com.learn2do.core.Appliance;
import com.learn2do.core.Switch;
import com.learn2do.devices.Fan;
import com.learn2do.devices.Lamp;

public class Main {

    public static void main(String[] args) {
        Appliance app1 = new Lamp();
        Appliance app2 = new Fan();
        Switch s1 = new Switch(app1);
        Switch s2 = new Switch(app2);
        s1.on();
        s2.on();
        delay(3);
        s1.off();
        delay(2);
        s2.off();
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
