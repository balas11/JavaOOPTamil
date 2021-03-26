package com.learn2do.core;

public abstract class Appliance {
    protected abstract void connect();
    protected abstract void disconnect();

    public final void on(){
        this.connect();
    }

    public final void off() {
        this.disconnect();
    }
}
