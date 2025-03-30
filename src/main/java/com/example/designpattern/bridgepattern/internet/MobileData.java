package com.example.designpattern.bridgepattern.internet;

import org.springframework.stereotype.Component;

@Component
public class MobileData implements InternetProvider {
    @Override
    public void connect() {
        System.out.println("Connected via Mobile Data");
    }
}