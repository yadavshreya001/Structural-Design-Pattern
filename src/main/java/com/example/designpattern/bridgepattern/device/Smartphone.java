package com.example.designpattern.bridgepattern.device;

import com.example.designpattern.bridgepattern.internet.InternetProvider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class Smartphone extends SmartDevice {

    @Autowired
    public Smartphone(@Qualifier("mobileData") InternetProvider internetProvider) {
        super(internetProvider);
    }

    @Override
    public void connectToInternet() {
        System.out.print("Smartphone ");
        internetProvider.connect();
    }
}