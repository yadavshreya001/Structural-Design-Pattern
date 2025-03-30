package com.example.designpattern.bridgepattern.internet;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public interface InternetProvider {
    void connect();
}