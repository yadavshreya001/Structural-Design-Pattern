package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop extends SmartDevice {

    @Autowired
    public Laptop(@Qualifier("broadband") InternetProvider internetProvider) {
        super(internetProvider);
    }

    @Override
    public void connectToInternet() {
        System.out.print("Laptop ");
        internetProvider.connect();
    }
}