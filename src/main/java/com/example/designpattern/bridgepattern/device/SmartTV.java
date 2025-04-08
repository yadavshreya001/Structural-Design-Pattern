package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * SmartTV class extends SmartDevice and connects using WiFi.
 */

public class SmartTV extends SmartDevice {

    public SmartTV(InternetProvider internetProvider) {
        super(internetProvider);   // Pass the internet provider to the superclass
    }

    @Override
    public void connectToInternet() {
        System.out.print("SmartTV ");
        internetProvider.connect();  // Delegates the connection to InternetProvider
    }
}