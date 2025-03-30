package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/**
 * Laptop class extends SmartDevice and connects using Broadband.
 */
@Component
public class Laptop extends SmartDevice {

    @Autowired
    public Laptop(@Qualifier("broadband") InternetProvider internetProvider) {
        super(internetProvider); // Pass the internet provider to the superclass
    }

    @Override
    public void connectToInternet() {
        System.out.print("Laptop ");
        internetProvider.connect(); // Delegates the connection to InternetProvider
    }
}