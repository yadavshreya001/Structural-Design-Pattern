package com.example.designpattern.adapterpattern;

/**
 * Another payment gateway (GatewayB) that does NOT follow the standard PaymentGateway interface.
 * It has a different method `charge(double amount)`.
 */
public class GatewayB {
    public void charge(double amount) {
        System.out.println("Charging payment with GatewayB: $" + amount);
    }
}
