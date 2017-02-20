package com.as.structural.bridge;

public class ConcreteRemote extends RemoteControl {

    public ConcreteRemote(TV tv) {
        super.tv = tv;
    }

    @Override
    public void onRC() {
        tv.onTV();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void setChannel() {
        tv.tuneChannel();
    }
}
