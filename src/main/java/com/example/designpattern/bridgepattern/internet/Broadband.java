package com.example.designpattern.bridgepattern.internet;

import org.springframework.stereotype.Component;


/**
 * Broadband is a concrete implementation of InternetProvider.
 */

public class Broadband implements InternetProvider {
    @Override
    public void connect() {
        System.out.println("Connected via Broadband");
    }
}