package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;


import org.springframework.beans.factory.annotation.Autowired;

public abstract class SmartDevice {
    protected InternetProvider internetProvider;

    @Autowired  // Injected by Spring
    public SmartDevice(InternetProvider internetProvider) {
        this.internetProvider = internetProvider;
    }

    public abstract void connectToInternet();
}