package com.example.designpattern.bridgepattern.internet;

import org.springframework.stereotype.Component;


/**
 * MobileData is another concrete implementation of InternetProvider.
 */

public class MobileData implements InternetProvider {
    @Override
    public void connect() {
        System.out.println("Connected via Mobile Data");
    }
}