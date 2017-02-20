package com.as.structural.bridge;

public class SonyControl implements TV {
    @Override
    public void onTV() {
        System.out.println("Sony On");
    }

    @Override
    public void off() {
        System.out.println("Sony Off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony tuneChannel");
    }
}
