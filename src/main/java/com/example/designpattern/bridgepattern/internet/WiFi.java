package com.example.designpattern.bridgepattern.internet;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/**
 * WiFi is another InternetProvider implementation.
 * It is marked as @Primary, meaning it will be injected by default.
 */

public class WiFi implements InternetProvider {
    @Override
    public void connect() {
        System.out.println("Connected via WiFi");
    }
}