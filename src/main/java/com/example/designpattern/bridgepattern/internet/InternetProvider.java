package com.example.designpattern.bridgepattern.internet;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/**
 * InternetProvider interface acts as the implementation side of the bridge.
 * Any internet provider must implement this interface.
 */

public interface InternetProvider {
    void connect();  // Abstract method to be implemented by concrete providers
}