package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Smartphone class extends SmartDevice and connects using Mobile Data.
 */

public class Smartphone extends SmartDevice {

    public Smartphone(InternetProvider internetProvider) {
        super(internetProvider);    // Pass the internet provider to the superclass
    }

    @Override
    public void connectToInternet() {
        System.out.print("Smartphone ");
        internetProvider.connect();  // Delegates the connection to InternetProvider
    }
}