package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * SmartDevice is an abstract class that acts as a bridge.
 * It delegates internet connection functionality to InternetProvider.
 */
public abstract class SmartDevice {
    protected InternetProvider internetProvider;  // Reference to an InternetProvider implementation

    public SmartDevice(InternetProvider internetProvider) {
        this.internetProvider = internetProvider;
    }

    /**
     * Abstract method to be implemented by concrete smart devices.
     */
    public abstract void connectToInternet();
}


