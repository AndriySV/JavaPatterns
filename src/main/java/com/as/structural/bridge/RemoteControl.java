package com.as.structural.bridge;

public abstract class RemoteControl {
    public TV tv;

    public abstract void onRC();

    public abstract void off();

    public abstract void setChannel();
}
