package com.as.structural.bridge;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new ConcreteRemote(new SonyControl());

        remoteControl.onRC();
        remoteControl.setChannel();
        remoteControl.off();
    }
}
