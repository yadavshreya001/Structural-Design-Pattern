package com.example.designpattern.adapterpattern;

/**
 * Concrete implementation of PaymentGateway.
 * This gateway follows the standard interface.
 */
public class GatewayA implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with GatewayA: $" + amount);
    }
}
